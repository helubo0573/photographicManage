package com.heav.photographic.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户角色信息映射实体
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-06-29 19:00:49
 */
 public class SysUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    private Long id;

    /**
    * 用户id
    */
    private Integer userId;

    /**
    * 角色id
    */
    private Integer roleId;


    /**
    * 获取主键Id
    *
    * @return id
    */
    public Long getId(){
        return id;
    }

    /**
    * 设置主键Id
    * 
    * @param 要设置的主键Id
    */
    public void setId(Long id){
        this.id = id;
    }

    /**
    * 获取用户id
    *
    * @return 用户id
    */
    public Integer getUserId(){
        return userId;
    }

    /**
    * 设置用户id
    * 
    * @param userId 要设置的用户id
    */
    public void setUserId(Integer userId){
        this.userId = userId;
    }

    /**
    * 获取角色id
    *
    * @return 角色id
    */
    public Integer getRoleId(){
        return roleId;
    }

    /**
    * 设置角色id
    * 
    * @param roleId 要设置的角色id
    */
    public void setRoleId(Integer roleId){
        this.roleId = roleId;
    }

}