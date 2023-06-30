package com.example.store.controller;

import com.example.store.domain.Shopping;
import com.example.store.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shopping")
public class ShoppingController {
    @Autowired
    private GoodsService goodsService;
    private Shopping shopping;
    public ShoppingController() {
        shopping = new Shopping();
    }
    @RequestMapping
    public String add_shopping(String id){
        shopping.setShopping(id);
        return "end";
    }
    @RequestMapping("/car")
    public String Shopping_car(Model model){
        shopping.setGoodsService(goodsService);
        model.addAttribute("shopping", shopping.getShopping());
        model.addAttribute("price", shopping.getPrice());
        return "shopping";
    }

}
