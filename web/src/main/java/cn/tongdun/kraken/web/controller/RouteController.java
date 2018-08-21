package cn.tongdun.kraken.web.controller;


import cn.tongdun.kraken.web.controller.commom.BaseController;
import cn.tongdun.kraken.web.support.security.LoginUserDetails;
import cn.tongdun.kraken.web.util.AuthUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiazhen on 17/2/14.
 */
@Controller
public class RouteController extends BaseController{

    private final static Logger logger = LoggerFactory.getLogger(RouteController.class);

    @RequestMapping("/login")
    public String loginForm(Model model) {

        System.out.println("进入login");
        if (AuthUtil.checkIfLogined()) {
            return "redirect:/";
        }
        return "login";
    }

    @RequestMapping("/ok")
    public String ok() {
        return "ok";
    }

    @RequestMapping("/graph")
    public String graph(ModelMap model) {
        LoginUserDetails userDetails = (LoginUserDetails) SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();
        model.put("userDetails",userDetails);
        return "graph";
    }

    @RequestMapping("/userCustomDetail")
    public String userCustomDetail(ModelMap model) {
        LoginUserDetails userDetails = (LoginUserDetails) SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();
        model.put("userDetails",userDetails);

        return "userCustomDetail";
    }



    @RequestMapping("/")
    public String index(ModelMap model) {
//        LoginUserDetails userDetails = (LoginUserDetails) SecurityContextHolder.getContext()
//                .getAuthentication().getPrincipal();
//        model.put("userDetails",userDetails);

        System.out.println("进入/");

        return "index";

    }

}