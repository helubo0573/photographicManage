package com.heav.photographic.core.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.heav.photographic.core.common.mapper.BaseMapper;
import com.heav.photographic.core.common.service.impl.BaseServiceImpl;
import com.heav.photographic.core.mapper.SysRoleMenuMapper;
import com.heav.photographic.core.domain.SysRoleMenu;
import com.heav.photographic.core.service.SysRoleMenuService;


/**
 * 自动发布产品编号ServiceImpl
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-05-29 11:33:56
 */
 
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends BaseServiceImpl<SysRoleMenu, Long> implements SysRoleMenuService {
	
    private static final Logger logger = LoggerFactory.getLogger(SysRoleMenuServiceImpl.class);
   
    @Resource
    private SysRoleMenuMapper sysRoleMenuMapper;

	@Override
	public BaseMapper<SysRoleMenu, Long> getMapper() {
		return sysRoleMenuMapper;
	}
	
}