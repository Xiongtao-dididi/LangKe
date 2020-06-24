package com.kgc.fallback;

import com.kgc.pojo.User;
import com.kgc.remote.ProductRemote;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class ProductRemoteFallBack implements ProductRemote {
    @Override
    public User getProductById(@RequestParam Integer productId, @RequestBody User user) {
        System.out.println("进入熔断器。。。。。ProductRemoteFallBack");
        System.out.println("熔断器Hystrix接收的参数productId："+productId);
        System.out.println("熔断器Hystrix接收的参数User："+user);
        User u =new User("18", productId);
        return u;
    }
}
