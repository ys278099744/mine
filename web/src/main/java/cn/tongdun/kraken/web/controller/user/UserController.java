package cn.tongdun.kraken.web.controller.user;

import cn.farmerspace.dal.dao.entity.book.UserEntity;
import cn.farmerspace.biz.service.user.UserEntityService;
import cn.farmerspace.core.result.Response;
import cn.tongdun.kraken.web.controller.commom.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.List;

/****************************************
 * @@CREATE : 2018-02-02 下午4:59
 * @@AUTH : NOT A CAT【NOTACAT@CAT.ORZ】
 * @@DESCRIPTION : 最短路径查询
 * @@VERSION :
 *
 *****************************************/
@Controller
@RequestMapping("book/")
public class UserController extends BaseController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserEntityService userEntityService;
    @RequestMapping("insertUser")
    @ResponseBody
    public Response<UserEntity> insertUser(String imgUrl,String nickName) throws ParseException {
        UserEntity userEntity=new UserEntity();
        userEntity.setImgUrl(imgUrl);
        List<UserEntity> users=userEntityService.selectEntity(userEntity);
        if (users.size()==0){
            userEntity.setNickName(nickName);
            userEntityService.save(userEntity);
            List<UserEntity> reusers=userEntityService.selectEntity(userEntity);
            return  Response.success(reusers.get(0));
        }else {
            return Response.success(users.get(0));
        }
    }
    @RequestMapping("updateUserInfo")
    @ResponseBody
    public String updateUserInfo(UserEntity user) throws ParseException {
        UserEntity userEntity=new UserEntity();
        userEntity.setId(user.getId());
        userEntity=userEntityService.selectEntity(userEntity).get(0);
        userEntity.setNickName(user.getNickName());
        userEntity.setName(user.getName());
        userEntity.setTel(user.getTel());
        userEntity.setUniversity(user.getUniversity());
        userEntityService.updateByPrimaryKey(userEntity);
        return "success";
    }
    @RequestMapping("updateUserAddr")
    @ResponseBody
    public String updateUserAddr(UserEntity user) throws ParseException {
        UserEntity userEntity=new UserEntity();
        userEntity.setId(user.getId());
        userEntity=userEntityService.selectEntity(userEntity).get(0);
        userEntity.setAddrProvince(user.getAddrProvince());
        userEntity.setAddrCity(user.getAddrProvince());
        userEntityService.updateByPrimaryKey(userEntity);
        return "success";
    }
}
