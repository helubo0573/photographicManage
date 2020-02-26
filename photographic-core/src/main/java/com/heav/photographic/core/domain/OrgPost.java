package com.heav.photographic.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品类型表实体
 * 
 * @author stone
 * @version 1.0.0
 * @date 2020-02-26 10:43:58
 */
 public class OrgPost implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    private Long id;

    /**
    * 属所机构id
    */
    private String orgId;

    /**
    * 所属部门ID
    */
    private String deptId;

    /**
    * 位岗名称
    */
    private String postName;

    /**
    * 
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
    * 获取属所机构id
    *
    * @return 属所机构id
    */
    public String getOrgId(){
        return orgId;
    }

    /**
    * 设置属所机构id
    * 
    * @param orgId 要设置的属所机构id
    */
    public void setOrgId(String orgId){
        this.orgId = orgId;
    }

    /**
    * 获取所属部门ID
    *
    * @return 所属部门ID
    */
    public String getDeptId(){
        return deptId;
    }

    /**
    * 设置所属部门ID
    * 
    * @param deptId 要设置的所属部门ID
    */
    public void setDeptId(String deptId){
        this.deptId = deptId;
    }

    /**
    * 获取位岗名称
    *
    * @return 位岗名称
    */
    public String getPostName(){
        return postName;
    }

    /**
    * 设置位岗名称
    * 
    * @param postName 要设置的位岗名称
    */
    public void setPostName(String postName){
        this.postName = postName;
    }

    /**
    * 获取
    *
    * @return 
    */
    public String getRemarks(){
        return remarks;
    }

    /**
    * 设置
    * 
    * @param remarks 要设置的
    */
    public void setRemarks(String remarks){
        this.remarks = remarks;
    }

}