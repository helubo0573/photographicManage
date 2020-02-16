package com.heav.photographic.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色信息实体
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-06-29 18:59:22
 */
 public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    private Long id;

    /**
    * 机构id
    */
    private String orgId;

    /**
    * 角色名称
    */
    private String ruleName;

    /**
    * 最后操作用户名
    */
    private String lastUpdateUser;

    /**
    * 最后更新时间
    */
    private Date updateTime;

    /**
    * 备注
    */
    private String remarks;

    /**
    * 状态:0：禁用  1：启用
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
    * 获取机构id
    *
    * @return 机构id
    */
    public String getOrgId(){
        return orgId;
    }

    /**
    * 设置机构id
    * 
    * @param orgId 要设置的机构id
    */
    public void setOrgId(String orgId){
        this.orgId = orgId;
    }

    /**
    * 获取角色名称
    *
    * @return 角色名称
    */
    public String getRuleName(){
        return ruleName;
    }

    /**
    * 设置角色名称
    * 
    * @param ruleName 要设置的角色名称
    */
    public void setRuleName(String ruleName){
        this.ruleName = ruleName;
    }

    /**
    * 获取最后操作用户名
    *
    * @return 最后操作用户名
    */
    public String getLastUpdateUser(){
        return lastUpdateUser;
    }

    /**
    * 设置最后操作用户名
    * 
    * @param lastUpdateUser 要设置的最后操作用户名
    */
    public void setLastUpdateUser(String lastUpdateUser){
        this.lastUpdateUser = lastUpdateUser;
    }

    /**
    * 获取最后更新时间
    *
    * @return 最后更新时间
    */
    public Date getUpdateTime(){
        return updateTime;
    }

    /**
    * 设置最后更新时间
    * 
    * @param updateTime 要设置的最后更新时间
    */
    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    }

    /**
    * 获取备注
    *
    * @return 备注
    */
    public String getRemarks(){
        return remarks;
    }

    /**
    * 设置备注
    * 
    * @param remarks 要设置的备注
    */
    public void setRemarks(String remarks){
        this.remarks = remarks;
    }

    /**
    * 获取状态:0：禁用  1：启用
    *
    * @return 状态:0：禁用  1：启用
    */
    public Integer getState(){
        return state;
    }

    /**
    * 设置状态:0：禁用  1：启用
    * 
    * @param state 要设置的状态:0：禁用  1：启用
    */
    public void setState(Integer state){
        this.state = state;
    }

}