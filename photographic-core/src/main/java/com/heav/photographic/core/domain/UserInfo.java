package com.heav.photographic.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品类型表实体
 * 
 * @author stone
 * @version 1.0.0
 * @date 2020-02-27 09:39:53
 */
 public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    private Long id;

    /**
    * 用户名
    */
    private String username;

    /**
    * 密码
    */
    private String password;

    /**
    * 注册时间
    */
    private Date registerTime;

    /**
    * 移动电话
    */
    private String mobileNumber;

    /**
    * 登录时间
    */
    private Date loginTime;

    /**
    * 
    */
    private Integer orgId;

    /**
    * 否是为管理员
    */
    private Integer isAdmin;

    /**
    * 锁定账号 1：锁定
    */
    private Integer state;


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
    * 获取用户名
    *
    * @return 用户名
    */
    public String getUsername(){
        return username;
    }

    /**
    * 设置用户名
    * 
    * @param username 要设置的用户名
    */
    public void setUsername(String username){
        this.username = username;
    }

    /**
    * 获取密码
    *
    * @return 密码
    */
    public String getPassword(){
        return password;
    }

    /**
    * 设置密码
    * 
    * @param password 要设置的密码
    */
    public void setPassword(String password){
        this.password = password;
    }

    /**
    * 获取注册时间
    *
    * @return 注册时间
    */
    public Date getRegisterTime(){
        return registerTime;
    }

    /**
    * 设置注册时间
    * 
    * @param registerTime 要设置的注册时间
    */
    public void setRegisterTime(Date registerTime){
        this.registerTime = registerTime;
    }

    /**
    * 获取移动电话
    *
    * @return 移动电话
    */
    public String getMobileNumber(){
        return mobileNumber;
    }

    /**
    * 设置移动电话
    * 
    * @param mobileNumber 要设置的移动电话
    */
    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }

    /**
    * 获取登录时间
    *
    * @return 登录时间
    */
    public Date getLoginTime(){
        return loginTime;
    }

    /**
    * 设置登录时间
    * 
    * @param loginTime 要设置的登录时间
    */
    public void setLoginTime(Date loginTime){
        this.loginTime = loginTime;
    }

    /**
    * 获取
    *
    * @return 
    */
    public Integer getOrgId(){
        return orgId;
    }

    /**
    * 设置
    * 
    * @param orgId 要设置的
    */
    public void setOrgId(Integer orgId){
        this.orgId = orgId;
    }

    /**
    * 获取否是为管理员
    *
    * @return 否是为管理员
    */
    public Integer getIsAdmin(){
        return isAdmin;
    }

    /**
    * 设置否是为管理员
    * 
    * @param isAdmin 要设置的否是为管理员
    */
    public void setIsAdmin(Integer isAdmin){
        this.isAdmin = isAdmin;
    }

    /**
    * 获取锁定账号 1：锁定
    *
    * @return 锁定账号 1：锁定
    */
    public Integer getState(){
        return state;
    }

    /**
    * 设置锁定账号 1：锁定
    * 
    * @param state 要设置的锁定账号 1：锁定
    */
    public void setState(Integer state){
        this.state = state;
    }

}