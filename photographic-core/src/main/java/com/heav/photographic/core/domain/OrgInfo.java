package com.heav.photographic.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品类型表实体
 * 
 * @author stone
 * @version 1.0.0
 * @date 2020-02-26 10:33:50
 */
 public class OrgInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    private Long id;

    /**
    * 
    */
    private String orgName;

    /**
    * 
    */
    private String orgAddress;

    /**
    * 详细地址
    */
    private String site;

    /**
    * 经营范围
    */
    private String range;

    /**
    * 
    */
    private Date createTime;

    /**
    * 创建的用户
    */
    private Integer createUser;


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
    * 获取
    *
    * @return 
    */
    public String getOrgName(){
        return orgName;
    }

    /**
    * 设置
    * 
    * @param orgName 要设置的
    */
    public void setOrgName(String orgName){
        this.orgName = orgName;
    }

    /**
    * 获取
    *
    * @return 
    */
    public String getOrgAddress(){
        return orgAddress;
    }

    /**
    * 设置
    * 
    * @param orgAddress 要设置的
    */
    public void setOrgAddress(String orgAddress){
        this.orgAddress = orgAddress;
    }

    /**
    * 获取详细地址
    *
    * @return 详细地址
    */
    public String getSite(){
        return site;
    }

    /**
    * 设置详细地址
    * 
    * @param site 要设置的详细地址
    */
    public void setSite(String site){
        this.site = site;
    }

    /**
    * 获取经营范围
    *
    * @return 经营范围
    */
    public String getRange(){
        return range;
    }

    /**
    * 设置经营范围
    * 
    * @param range 要设置的经营范围
    */
    public void setRange(String range){
        this.range = range;
    }

    /**
    * 获取
    *
    * @return 
    */
    public Date getCreateTime(){
        return createTime;
    }

    /**
    * 设置
    * 
    * @param createTime 要设置的
    */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

    /**
    * 获取创建的用户
    *
    * @return 创建的用户
    */
    public Integer getCreateUser(){
        return createUser;
    }

    /**
    * 设置创建的用户
    * 
    * @param createUser 要设置的创建的用户
    */
    public void setCreateUser(Integer createUser){
        this.createUser = createUser;
    }

}