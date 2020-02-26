package com.heav.photographic.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品类型表实体
 * 
 * @author stone
 * @version 1.0.0
 * @date 2020-02-26 10:23:11
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
    private String orgId;

    /**
    * 产品类型名称
    */
    private String goodstype;

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
    * 获取产品类型名称
    *
    * @return 产品类型名称
    */
    public String getGoodstype(){
        return goodstype;
    }

    /**
    * 设置产品类型名称
    * 
    * @param goodstype 要设置的产品类型名称
    */
    public void setGoodstype(String goodstype){
        this.goodstype = goodstype;
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