package com.micro.oauth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
@Slf4j
public class AuthController {

    @GetMapping("/authorization")

    public String getProduct() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "product id : " ;
    }

}
