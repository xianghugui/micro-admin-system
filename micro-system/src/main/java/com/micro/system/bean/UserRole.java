package com.micro.system.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 用户角色关联信息
 */
@Setter
@Getter
@Table(name = "s_user_role")
public class UserRole {
    @Id
    private Integer id;//表主键

    @Column(name = "role_id")
    private Integer roleId;//角色id

    @Column(name = "user_id")
    private Integer userId;//用户id

    @Column(name = "user_role_association_code")
    private Integer userRoleAssociationCode;//用户角色关联码

}