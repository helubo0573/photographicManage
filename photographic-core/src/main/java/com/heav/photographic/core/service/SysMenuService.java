package com.heav.photographic.core.service;

import java.util.List;

import com.heav.photographic.core.common.service.BaseService;
import com.heav.photographic.core.domain.SysMenu;
import com.heav.photographic.core.model.MenuModel;

/**
 * 自动发布产品编号Service
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-05-29 11:06:27
 */
public interface SysMenuService extends BaseService<SysMenu, Long>{

	List<MenuModel> getMenuListByRoleIds(List<Long> roleIdList);

}
