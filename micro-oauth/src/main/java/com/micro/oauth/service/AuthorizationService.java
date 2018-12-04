package com.micro.oauth.service;

import com.alibaba.fastjson.JSONObject;
import com.micro.oauth.mapper.AuthorizationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class AuthorizationService {
    @Autowired
    private AuthorizationMapper authorizationMapper;

    JSONObject authorization(JSONObject jsonObject){

        return  null;
    }
}
