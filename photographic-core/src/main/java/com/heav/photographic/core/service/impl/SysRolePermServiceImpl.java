package com.heav.photographic.core.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.heav.photographic.core.common.mapper.BaseMapper;
import com.heav.photographic.core.common.service.impl.BaseServiceImpl;
import com.heav.photographic.core.mapper.SysRolePermMapper;
import com.heav.photographic.core.domain.SysRolePerm;
import com.heav.photographic.core.service.SysRolePermService;


/**
 * 自动发布产品编号ServiceImpl
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-05-30 14:30:01
 */
 
@Service("sysRolePermService")
public class SysRolePermServiceImpl extends BaseServiceImpl<SysRolePerm, Long> implements SysRolePermService {
	
    private static final Logger logger = LoggerFactory.getLogger(SysRolePermServiceImpl.class);
   
    @Resource
    private SysRolePermMapper sysRolePermMapper;

	@Override
	public BaseMapper<SysRolePerm, Long> getMapper() {
		return sysRolePermMapper;
	}
	
}