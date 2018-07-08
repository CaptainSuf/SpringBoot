package com.dev.ctrl;

import com.dev.model.TbUserLoginPO;
import com.dev.model.User;
import com.dev.service.UserService;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class LoginCtrl {

    @Resource
    private UserService userService;

    @Resource
    private DiscoveryClient client;
    
    @RequestMapping("/index.html")
    public String index(){
    	ServiceInstance instance = client.getLocalServiceInstance();
    	System.out.println(instance.getHost()+","+instance.getServiceId());
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

    @ResponseBody
    @RequestMapping("/test.do")
    public String test()throws Exception{
        User user = userService.selectUserById(1);
        if(user!=null){
            return "测试成功";
        }
        return "测试失败";
    }
}
