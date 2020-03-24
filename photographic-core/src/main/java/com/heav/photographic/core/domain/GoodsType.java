package com.heav.photographic.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品类型表实体
 * 
 * @author stone
 * @version 1.0.0
 * @date 2020-03-16 15:30:13
 */
 public class GoodsType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    private Long id;

    /**
    * 机构id
    */
    private Integer orgId;

    /**
    * 
    */
    private Integer parentId;

    /**
    * 产品类型名称
    */
    private String typename;

    /**
    * 备注
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
    * 获取机构id
    *
    * @return 机构id
    */
    public Integer getOrgId(){
        return orgId;
    }

    /**
    * 设置机构id
    * 
    * @param orgId 要设置的机构id
    */
    public void setOrgId(Integer orgId){
        this.orgId = orgId;
    }

    /**
    * 获取
    *
    * @return 
    */
    public Integer getParentId(){
        return parentId;
    }

    /**
    * 设置
    * 
    * @param parentId 要设置的
    */
    public void setParentId(Integer parentId){
        this.parentId = parentId;
    }

    /**
    * 获取产品类型名称
    *
    * @return 产品类型名称
    */
    public String getTypename(){
        return typename;
    }

    /**
    * 设置产品类型名称
    * 
    * @param typename 要设置的产品类型名称
    */
    public void setTypename(String typename){
        this.typename = typename;
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

}