package com.micro.system.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 系统菜单树相关信息
 */
@Setter
@Getter
@Table(name = "s_menu")
public class Menu {
    @Id
    private String id;//表主键(通过编码体现父子关系)

    private String code;//路径编码

    private String title;//目录树标题

    @Column(name = "parent_id")
    private String parent_id;//父级节点

    private String href;//资源路径

    private String icon;//当前节点图标

    private String type;//

    private String path;//菜单上下级关系

    private String enabled;//启用禁用

    private String description;//描述

    @Column(name = "create_user")
    private Integer createUser;//创建用户

    @Column(name = "create_time")
    private Date createTime;//创建用户

}