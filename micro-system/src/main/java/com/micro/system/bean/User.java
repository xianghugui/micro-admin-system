package com.micro.system.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 系统用户相关信息
 */
@Setter
@Getter
@Table(name = "s_user")
public class User {
    @Id
    private Integer id;//表主键

    @Column(name = "username")
    private String userName;//登录用户名

    @Column(name = "password")
    private String passWord;//密码

    private String name;//展示昵称

    @Column(name = "parent_id")
    private String phone;//电话

    private String email;//邮箱

    private Integer status;//帐号状态

    @Column(name = "role_group_code")
    private Integer roleGroupCode;//

    private String description;//描述

    @Column(name = "create_user")
    private Integer createUser;//创建用户

    @Column(name = "create_time")
    private Date createTime;//创建用户

}