package com.micro.system.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * 系统页面操作元素（按钮，数据列表展示等）相关信息
 */
@Setter
@Getter
@Table(name = "s_element")
public class Element {
    @Id
    private Integer id;//主键

    @Column(name = "authorization_code")
    private String authorizationCode;//授权码

    @Column(name = "element_type")
    private String elementType;//资源类型（按钮，链接 等）

    private String name;//资源权限名称

    private String uri;//资源路径

    @Column(name = "menu_id")
    private String menuId;//资源关联菜单

    private String method;//资源请求类型(put,get等)

    private String description;//描述

    @Column(name = "create_user")
    private Integer createUser;//创建用户

    @Column(name = "create_time")
    private Date createTime;//创建用户

}