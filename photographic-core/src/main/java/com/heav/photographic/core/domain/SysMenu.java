package com.heav.photographic.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 自动发布产品编号实体
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-05-29 11:06:27
 */
 public class SysMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    private int id;

    /**
    * 单菜名称
    */
    private String menuName;

    /**
    * 父菜单id
    */
    private Integer parentId;

    /**
    * 图标
    */
    private String iconCode;

    /**
    * 排序
    */
    private Integer sort;

    /**
    * 备注
    */
    private String remarks;


    /**
    * 获取主键Id
    *
    * @return id
    */
    public int getId(){
        return id;
    }

    /**
    * 设置主键Id
    * 
    * @param 要设置的主键Id
    */
    public void setId(int id){
        this.id = id;
    }

    /**
    * 获取单菜名称
    *
    * @return 单菜名称
    */
    public String getMenuName(){
        return menuName;
    }

    /**
    * 设置单菜名称
    * 
    * @param menuName 要设置的单菜名称
    */
    public void setMenuName(String menuName){
        this.menuName = menuName;
    }

    /**
    * 获取父菜单id
    *
    * @return 父菜单id
    */
    public int getParentId(){
        return parentId;
    }

    /**
    * 设置父菜单id
    * 
    * @param parentId 要设置的父菜单id
    */
    public void setParentId(Integer parentId){
        this.parentId = parentId;
    }

    /**
    * 获取图标
    *
    * @return 图标
    */
    public String getIconCode(){
        return iconCode;
    }

    /**
    * 设置图标
    * 
    * @param iconCode 要设置的图标
    */
    public void setIconCode(String iconCode){
        this.iconCode = iconCode;
    }

    /**
    * 获取排序
    *
    * @return 排序
    */
    public Integer getSort(){
        return sort;
    }

    /**
    * 设置排序
    * 
    * @param sort 要设置的排序
    */
    public void setSort(Integer sort){
        this.sort = sort;
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