package com.micro.system.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 角色权限信息
 */
@Setter
@Getter
@Table(name = "s_element_role_authority")
public class ElementRoleAuthority {
    @Id
    private Integer id;//表主键

    @Column(name = "role_id")
    private Integer roleId;//角色id

    @Column(name = "element_id")
    private Integer elementId;//授权资源id

    @Column(name = "create_user")
    private Integer createUser;//创建用户

    @Column(name = "create_time")
    private Date createTime;//创建用户

}