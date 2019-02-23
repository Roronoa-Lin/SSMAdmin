package com.admin.web;

import com.admin.entity.Retail;
import com.admin.entity.User;
import com.admin.service.RetailService;
import com.admin.service.TestService;
import com.admin.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {
    @Autowired
    private UserService userService;
    @Autowired
    private TestService testService;
    @Autowired
    private RetailService retailService;

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
    public String test(Model m){
        int userc = userService.testcount();
        m.addAttribute("usc",userc);
        return "/pages/charts/charts";
    }
    @RequestMapping("/chartso")
    public String testo(Model m){
        int userc = testService.countstore();
        m.addAttribute("usc",userc);
        return "/pages/charts/charts";
    }
    @RequestMapping("/jsondata")
    @ResponseBody
    public String json(){
        List<User> users = userService.listall();
        String jsondata = JSON.toJSONString(users);
        return jsondata;
        /*String jsondata = "";
        String mail;
        String password;
        int id;
        List users = userService.listall();
        for (int i=0;i<users.size();i++){
            User user = (User)users.get(i);
            mail = user.getMail();
            password = user.getPassword();
            id = user.getId();
            jsondata += '['+"Id:"+id+';'+"Mail:"+mail+';'+"Password:"+password+"];";
        }
        return jsondata;*/
    }

    @RequestMapping("/data")
    @ResponseBody
    public String data(){
        int [] data = new int[]{1,2,3,4,5,6,7,8,9};
        return java.util.Arrays.toString(data);
    }

    @RequestMapping(value="/jsondatac",produces = {"application/json;","text/html;charset=utf-8"})
    @ResponseBody
    public String jsonc(){
        List<Retail> retails = retailService.Customersum();
        String Customersum = JSON.toJSONString(retails);
        return Customersum;
    }

}
