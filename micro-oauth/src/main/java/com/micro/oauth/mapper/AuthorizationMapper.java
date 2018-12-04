package com.micro.oauth.mapper;


import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthorizationMapper {

    /**
     * 根据用户名查询当前用户是否存在
     * 如果存在则查询出用户的角色，拥有的权限等信息
     * @return  包括用户信息，角色信息，权限信息的json对象
     */
    JSONObject userInfo();

}