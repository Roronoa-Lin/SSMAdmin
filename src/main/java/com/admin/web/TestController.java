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
        return "redirect:users";
    }
    @RequestMapping("/charts")
    public String test(){
        return "/pages/charts/charts";
    }
}
