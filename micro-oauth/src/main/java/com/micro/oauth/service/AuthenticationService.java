package com.micro.oauth.service;

import com.alibaba.fastjson.JSONObject;
import com.micro.oauth.mapper.AuthenticationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class AuthenticationService {
    @Autowired
    private AuthenticationMapper authenticationMapper;

    JSONObject authorization(JSONObject jsonObject){

        return  null;
    }
}
