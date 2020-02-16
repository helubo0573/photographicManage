package com.heav.photographic.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 自动发布产品编号实体
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-05-30 14:28:29
 */
 public class SysPerm implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    private Long id;

    /**
    * 编码
    */
    private String code;

    /**
    * 权限名称
    */
    private String name;

    /**
    * 权限级别 1-系统级别 2-普通级别
    */
    private Integer permLevel;

    /**
    * 权限备注
    */
    private String remark;

    /**
    * 添加时间
    */
    private Date addTime;

    /**
    * 添加人
    */
    private String addUser;

    /**
    * 菜单ID
    */
    private Integer menuId;


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
    * 获取编码
    *
    * @return 编码
    */
    public String getCode(){
        return code;
    }

    /**
    * 设置编码
    * 
    * @param code 要设置的编码
    */
    public void setCode(String code){
        this.code = code;
    }

    /**
    * 获取权限名称
    *
    * @return 权限名称
    */
    public String getName(){
        return name;
    }

    /**
    * 设置权限名称
    * 
    * @param name 要设置的权限名称
    */
    public void setName(String name){
        this.name = name;
    }

    /**
    * 获取权限级别 1-系统级别 2-普通级别
    *
    * @return 权限级别 1-系统级别 2-普通级别
    */
    public Integer getPermLevel(){
        return permLevel;
    }

    /**
    * 设置权限级别 1-系统级别 2-普通级别
    * 
    * @param permLevel 要设置的权限级别 1-系统级别 2-普通级别
    */
    public void setPermLevel(Integer permLevel){
        this.permLevel = permLevel;
    }

    /**
    * 获取权限备注
    *
    * @return 权限备注
    */
    public String getRemark(){
        return remark;
    }

    /**
    * 设置权限备注
    * 
    * @param remark 要设置的权限备注
    */
    public void setRemark(String remark){
        this.remark = remark;
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
    * 获取菜单ID
    *
    * @return 菜单ID
    */
    public Integer getMenuId(){
        return menuId;
    }

    /**
    * 设置菜单ID
    * 
    * @param menuId 要设置的菜单ID
    */
    public void setMenuId(Integer menuId){
        this.menuId = menuId;
    }

}