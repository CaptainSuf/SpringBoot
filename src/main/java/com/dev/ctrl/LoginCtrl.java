package com.dev.ctrl;

import com.dev.model.TbUserLoginPO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginCtrl {

    @RequestMapping("/index.html")
    public String index(){
        return "login";
    }

    @ResponseBody
    @RequestMapping("/login.do")
    public String login(TbUserLoginPO login){
        if("admin".equals(login.getUserName()) && "123456".equals(login.getPassword())){
            return "登陆成功";
        }
        return "登陆失败";
    }
}
