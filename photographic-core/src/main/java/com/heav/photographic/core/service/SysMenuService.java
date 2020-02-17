package com.heav.photographic.core.service;

import java.util.List;

import com.heav.photographic.core.common.service.BaseService;
import com.heav.photographic.core.domain.SysMenu;
import com.heav.photographic.core.model.MenuModel;

/**
 * 用户角色信息映射Service
 * 
 * @author stone
 * @version 1.0.0
 * @date 2020-02-16 18:55:12
 */
public interface SysMenuService extends BaseService<SysMenu, Long>{

	List<MenuModel> getMenuListByRoleIds(List<Long> roleIdList);
}
