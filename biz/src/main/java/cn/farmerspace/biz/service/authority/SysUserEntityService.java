package cn.farmerspace.biz.service.authority;


import cn.farmerspace.dal.dao.entity.authority.SysUserEntity;
import cn.farmerspace.dal.dao.mapper.authority.SysUserEntityMapper;
import cn.farmerspace.core.tkmybatis.BaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/****************************************
 * @@CREATE : 2018-02-02 上午11:39
 * @@AUTH : NOT A CAT【NOTACAT@CAT.ORZ】
 * @@DESCRIPTION : 
 * @@VERSION :
 *
 *****************************************/
@Service
public class SysUserEntityService extends BaseServiceImpl<SysUserEntity> {
    private final static Logger logger = LoggerFactory.getLogger(SysUserEntityService.class);

    @Autowired
    private SysUserEntityMapper sysUserEntityMapper;


}
