package cn.tongdun.kraken.web.support.security;

import cn.farmerspace.dal.dao.entity.authority.SysUserEntity;
import cn.farmerspace.biz.service.authority.SysUserEntityService;
import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Map;

/**
 * Created by xiazhen on 17/1/4.
 */
public class AuthProvider implements AuthenticationProvider {

    private static final Logger LOGGER_Login = LoggerFactory.getLogger("loginLog");

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthProvider.class);

    @Autowired
    private SysUserEntityService sysUserEntityService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        final String loginId = (String) authentication.getPrincipal();
        final String password = (String) authentication.getCredentials();

        Map<String, Object> logMap = Maps.newHashMap();
        logMap.put("userid", loginId);
        try {
            final LoginUserDetails user = authJdbc(loginId, password);
            SimpleGrantedAuthority authority = null;
            if (user != null) {
                authority = new SimpleGrantedAuthority("user");
            } else {
                throw new AuthenticationCredentialsNotFoundException("不合法的用户名和密码");
            }

            final UsernamePasswordAuthenticationToken ua = new UsernamePasswordAuthenticationToken(
                    user, null, Lists.newArrayList(authority)
            );
            logMap.put("success", true);
            LOGGER_Login.info(JSON.toJSONString(logMap));
            return ua;
        } catch (Exception e) {
            logMap.put("success", false);
            logMap.put("msg", e.getMessage());
            LOGGER_Login.info(JSON.toJSONString(logMap));
            LOGGER.error(e.getMessage(), e);
            throw new AuthenticationCredentialsNotFoundException("不合法的用户名和密码",null);
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }


    public LoginUserDetails authJdbc(String loginId, String pwd) {

        try {
            SysUserEntity sysUserExample = new SysUserEntity();
            sysUserExample.setUserId(loginId);
            SysUserEntity sysUserEntity = sysUserEntityService.selectOne(sysUserExample);
           if (pwd.equals(sysUserEntity.getUserPwd())){
               String cnName=sysUserEntity.getCnName();
               LoginUserDetails user=new LoginUserDetails(loginId,cnName,pwd,Lists.newArrayList());
               user.setEmail(sysUserEntity.getMail());
               user.setAppkey(sysUserEntity.getAppkey());
               user.setAppsecret(sysUserEntity.getAppsecret());
               return user ;
            }else{
               return null;
           }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return null;
    }
}