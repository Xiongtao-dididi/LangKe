package com.kgc.remote;

import com.kgc.fallback.ProductRemoteFallBack;
import com.kgc.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "client-product",fallback = ProductRemoteFallBack.class)
public interface ProductRemote {
    @GetMapping("/getProductById")
    User getProductById(@RequestParam(value = "productId") Integer productId,@RequestBody User user);

}
