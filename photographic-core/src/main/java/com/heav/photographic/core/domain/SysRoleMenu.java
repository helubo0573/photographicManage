package com.heav.photographic.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 自动发布产品编号实体
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-05-29 11:33:56
 */
 public class SysRoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    private Long id;

    /**
    * 
    */
    private Integer ruleId;

    /**
    * 
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
    * 获取
    *
    * @return 
    */
    public Integer getRuleId(){
        return ruleId;
    }

    /**
    * 设置
    * 
    * @param ruleId 要设置的
    */
    public void setRuleId(Integer ruleId){
        this.ruleId = ruleId;
    }

    /**
    * 获取
    *
    * @return 
    */
    public Integer getMenuId(){
        return menuId;
    }

    /**
    * 设置
    * 
    * @param menuId 要设置的
    */
    public void setMenuId(Integer menuId){
        this.menuId = menuId;
    }

}