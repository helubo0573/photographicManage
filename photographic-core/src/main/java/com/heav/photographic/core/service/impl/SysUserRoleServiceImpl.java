package com.heav.photographic.core.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.heav.photographic.core.common.mapper.BaseMapper;
import com.heav.photographic.core.common.service.impl.BaseServiceImpl;
import com.heav.photographic.core.mapper.SysUserRoleMapper;
import com.heav.photographic.core.domain.SysUserRole;
import com.heav.photographic.core.service.SysUserRoleService;


/**
 * 用户角色信息映射ServiceImpl
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-06-29 19:00:49
 */
 
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends BaseServiceImpl<SysUserRole, Long> implements SysUserRoleService {
	
    private static final Logger logger = LoggerFactory.getLogger(SysUserRoleServiceImpl.class);
   
    @Resource
    private SysUserRoleMapper sysUserRoleMapper;

	@Override
	public BaseMapper<SysUserRole, Long> getMapper() {
		return sysUserRoleMapper;
	}
	
}