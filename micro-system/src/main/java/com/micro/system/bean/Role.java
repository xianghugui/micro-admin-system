package com.micro.system.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 角色相关信息
 */
@Setter
@Getter
@Table(name = "s_role")
public class Role {
    @Id
    private Integer id;//表主键

    private String code;//角色标识

    private String name;//角色名称

    private String description;//描述

    @Column(name = "create_user")
    private Integer createUser;//创建用户

    @Column(name = "create_time")
    private Date createTime;//创建用户

}