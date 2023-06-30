package com.example.store.controller;

import com.example.store.domain.Account;
import com.example.store.domain.Goods;
import com.example.store.service.AccountService;
import com.example.store.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//@RestController
@Controller
@RequestMapping("/user")
//@ResponseBody
public class UserController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private GoodsService goodsService;
    @RequestMapping
    public String login(){
        return "login";
    }

    @RequestMapping("/find")
       public String FindUser(String username,String password,Model model) {
        Account user = accountService.findUser(username);
        //用户名错误
        if (user != null) {//登录成功
            if (user.getPassword().equals(password)) {
                List<Goods> goods = goodsService.findAll();
                model.addAttribute("goods", goods);
                return "goods";
            } //登录失败

        }
        return "login";
    }

    @RequestMapping("/newUser")
        public String register(){
        return "register";
    }

    @RequestMapping("/adduser")
        public String addUser(String username,String password){
        Account account = new Account(username, password);
        accountService.save(account);
        return "login";
    }
}

