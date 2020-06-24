package com.kgc.controller;

import com.kgc.pojo.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @RequestMapping("/getProductById")
    public User getProductById(@RequestParam(value = "productId") Integer productId,@RequestBody User user){
        User u = new User("dididi",23);
        u.notify();
        System.out.println("服务器供者》根据Id查询商品："+productId);
        System.out.println("服务器供者》接收到条件user："+u);
        return u;
    }
}
