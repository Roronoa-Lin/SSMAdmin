package com.bookshop_ssm.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;

@Controller
public class TestController {

    //登录页
    @RequestMapping("/login")
    public String login(){
        return "/pages/examples/login";
    }

    //登录验证
    @RequestMapping("/loginaction")
    public String select(Model model, HttpSession session, @RequestParam("email") String email, @RequestParam("password") String password)
    {
        String user = (String)session.getAttribute("user");
        if (user==null){
            if (email.equals(password)){
                session.setAttribute("user",email); //设置session
                return "redirect:admin";
            }else{
                model.addAttribute("message","密码错误，请重新输入！");
                return  "/pages/examples/login";
            }
        }else{
            model.addAttribute("user",user);
            return "index";
        }

    }
    //等入主界面
    @RequestMapping(value = "/admin")
    public String admin(Model model,HttpSession session)
    {
        String user = (String)session.getAttribute("user");
        model.addAttribute("user",user);
        return "index";
    }

    //登出
    @RequestMapping("/signout")
    public String signout(HttpSession session){
        session.removeAttribute("user");
        return "/pages/examples/login";
    }
}
