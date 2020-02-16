package com.heav.photographic.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 自动发布产品编号实体
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-05-30 14:30:01
 */
 public class SysRolePerm implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    private Long id;

    /**
    * 角色ID
    */
    private Integer roleId;

    /**
    * 权限ID
    */
    private Integer permId;

    /**
    * 添加人
    */
    private String addUser;

    /**
    * 添加时间
    */
    private Date addTime;


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
    * 获取角色ID
    *
    * @return 角色ID
    */
    public Integer getRoleId(){
        return roleId;
    }

    /**
    * 设置角色ID
    * 
    * @param roleId 要设置的角色ID
    */
    public void setRoleId(Integer roleId){
        this.roleId = roleId;
    }

    /**
    * 获取权限ID
    *
    * @return 权限ID
    */
    public Integer getPermId(){
        return permId;
    }

    /**
    * 设置权限ID
    * 
    * @param permId 要设置的权限ID
    */
    public void setPermId(Integer permId){
        this.permId = permId;
    }

    /**
    * 获取添加人
    *
    * @return 添加人
    */
    public String getAddUser(){
        return addUser;
    }

    /**
    * 设置添加人
    * 
    * @param addUser 要设置的添加人
    */
    public void setAddUser(String addUser){
        this.addUser = addUser;
    }

    /**
    * 获取添加时间
    *
    * @return 添加时间
    */
    public Date getAddTime(){
        return addTime;
    }

    /**
    * 设置添加时间
    * 
    * @param addTime 要设置的添加时间
    */
    public void setAddTime(Date addTime){
        this.addTime = addTime;
    }

}