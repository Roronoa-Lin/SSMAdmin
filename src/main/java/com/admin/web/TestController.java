package com.admin.web;

import com.admin.entity.User;
import com.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    private UserService userService;
    @RequestMapping("/test")
    public String test(Model model, @RequestParam("email") String mail, @RequestParam("password") String password){
        int test = userService.login(mail,password);
        if (test==1){
            model.addAttribute("message","有");
            return "/pages/examples/login";
        }else {
            model.addAttribute("message","无");
            return "/pages/examples/login";
        }
    }

    @RequestMapping("/testuser")
    public String testuser(Model model, @RequestParam("email") String mail, @RequestParam("password") String password){
        User test = userService.user(mail,password);
        String testMail = test.getMail();
        if (test.equals(null)){
            model.addAttribute("message","无");
            return "/pages/examples/login";
        }else {
            model.addAttribute("message",testMail);
            return "/pages/examples/login";

        }
    }
    @RequestMapping("/users")
    public String users(Model model){
        List<User> list = userService.listall();
        model.addAttribute("data",list);
        return "/pages/tables/data";
    }
    @RequestMapping("/testbook")
    public String testbook(){
        return "testbook";
    }

    @RequestMapping("/adduser")
    public String adduser(@RequestParam("email") String email,@RequestParam("name") String name,@RequestParam("password") String password){
        userService.adduser(email,name,password);
        System.out.println("新增成功！");
        return "redirect:users";
    }
}
