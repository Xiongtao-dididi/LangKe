package com.kgc.controller;

import com.kgc.pojo.User;
import com.kgc.remote.ProductRemote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class OrderController {

    @Resource
    private ProductRemote productRemote;

    @GetMapping("/getOrderDetail")
    public Object getOrderDetail(){
        User u =new User("啦啦啦",23);
        System.out.println(u);
        User user = productRemote.getProductById(7758258,u);
        System.out.println("服务消费者》获取到远程服务提供的商品信息"+ u);
        return u;
    }
}
