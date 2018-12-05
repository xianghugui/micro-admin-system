package com.micro.oauth.mapper;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthenticationMapper {

    /**
     * 根据用户名查询当前用户是否存在
     * @return
     */
    JSONArray userInfo(JSONObject jsonObject);

}