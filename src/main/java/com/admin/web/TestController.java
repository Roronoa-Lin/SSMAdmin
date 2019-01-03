package com.admin.web;

import com.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
}
