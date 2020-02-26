package com.heav.photographic.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品类型表实体
 * 
 * @author stone
 * @version 1.0.0
 * @date 2020-02-26 10:25:53
 */
 public class OrgDept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    private Long id;

    /**
    * 构机ID
    */
    private String orgId;

    /**
    * 部门名称
    */
    private String deptName;

    /**
    * 注备
    */
    private String remarks;


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
    * 获取构机ID
    *
    * @return 构机ID
    */
    public String getOrgId(){
        return orgId;
    }

    /**
    * 设置构机ID
    * 
    * @param orgId 要设置的构机ID
    */
    public void setOrgId(String orgId){
        this.orgId = orgId;
    }

    /**
    * 获取部门名称
    *
    * @return 部门名称
    */
    public String getDeptName(){
        return deptName;
    }

    /**
    * 设置部门名称
    * 
    * @param deptName 要设置的部门名称
    */
    public void setDeptName(String deptName){
        this.deptName = deptName;
    }

    /**
    * 获取注备
    *
    * @return 注备
    */
    public String getRemarks(){
        return remarks;
    }

    /**
    * 设置注备
    * 
    * @param remarks 要设置的注备
    */
    public void setRemarks(String remarks){
        this.remarks = remarks;
    }

}