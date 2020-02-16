package com.heav.photographic.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.heav.photographic.core.common.mapper.BaseMapper;
import com.heav.photographic.core.common.service.impl.BaseServiceImpl;
import com.heav.photographic.core.mapper.SysRoleMapper;
import com.heav.photographic.core.domain.SysRole;
import com.heav.photographic.core.service.SysRoleService;


/**
 * 角色信息ServiceImpl
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-06-29 18:59:22
 */
 
@Service("sysRoleService")
public class SysRoleServiceImpl extends BaseServiceImpl<SysRole, Long> implements SysRoleService {
	
    private static final Logger logger = LoggerFactory.getLogger(SysRoleServiceImpl.class);
   
    @Resource
    private SysRoleMapper sysRoleMapper;

	@Override
	public BaseMapper<SysRole, Long> getMapper() {
		return sysRoleMapper;
	}

	@Override
	public SysRole getRoleById(Integer roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysRole> getRoleListByUserId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}