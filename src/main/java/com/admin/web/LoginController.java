package com.admin.web;
import com.admin.entity.User;
import com.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired UserService userService;

    //登录页
    @RequestMapping("/login")
    public String login(){
        return "/pages/examples/login";
    }
    //登录验证
    @RequestMapping("/loginaction")
    public String select(Model model, HttpSession session, @RequestParam("email") String email, @RequestParam("password") String password)
    {
        User user = userService.user(email,password);
        if (user==null){
            model.addAttribute("message","密码错误，请重新输入！");
            return  "/pages/examples/login";
            }else{
            session.setAttribute("user",user); //设置session
            return "redirect:admin";
            }
    }

    //等入主界面
    @RequestMapping(value = "/admin")
    public String admin(/*Model model,HttpSession session*/)
    {
        /*User user = (User)session.getAttribute("user");
        String username = user.getName();
        model.addAttribute("user",username);*/
        return "index";
    }

    //登出
    @RequestMapping("/signout")
    public String signout(HttpSession session){
        session.removeAttribute("user");
        return "/pages/examples/login";
    }
    @RequestMapping("/index2")
    public String index(){
        return "/index2";
    }
}
