package com.bookshop_ssm.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class TestController {
    //访问index测试session登陆权限
    @RequestMapping(value = "/admintt",method = RequestMethod.GET)
    public String select(Model model,HttpSession session)
    {
        String user = (String)session.getAttribute("user");
        if (user.equals(null)){
            return  "/pages/examples/login";
        }else{
            model.addAttribute("user",user);
            return "index";
        }

    }
    //登陆页面
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(Model model)
    {
        /*model.addAttribute("username","Hello world!!!");*/
        return "/pages/examples/login";
    }
    //登陆验证
    @RequestMapping("/admin")
    public String loginaction(HttpSession session,Model model,@RequestParam("email") String email, @RequestParam("password") String password){
        if (email.equals(password)){
            session.setAttribute("user",email); //设置session
            model.addAttribute("user",email); //返回值给模板
            return "index";
        }else{
            model.addAttribute("message","用户名或者密码错误，请重新登陆！");
            return  "/pages/examples/login";
        }
    }
    //登出
    @RequestMapping("/signout")
    public String signout(HttpSession session){
        session.removeAttribute("user");
        return "login";
    }
}
