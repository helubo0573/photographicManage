package com.heav.photographic.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.heav.photographic.core.common.mapper.BaseMapper;
import com.heav.photographic.core.common.service.impl.BaseServiceImpl;
import com.heav.photographic.core.mapper.SysMenuMapper;
import com.heav.photographic.core.model.MenuModel;
import com.heav.photographic.core.domain.SysMenu;
import com.heav.photographic.core.service.SysMenuService;


/**
 * 自动发布产品编号ServiceImpl
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-05-29 11:06:27
 */
 
@Service(value="sysMenuService")
public class SysMenuServiceImpl extends BaseServiceImpl<SysMenu, Long> implements SysMenuService {
	
    private static final Logger logger = LoggerFactory.getLogger(SysMenuServiceImpl.class);
   
    @Resource
    private SysMenuMapper sysMenuMapper;

	@Override
	public BaseMapper<SysMenu, Long> getMapper() {
		return sysMenuMapper;
	}

	@Override
	public List<MenuModel> getMenuListByRoleIds(List<Long> roleIdList) {
		// TODO Auto-generated method stub
		return null;
	}
	
}