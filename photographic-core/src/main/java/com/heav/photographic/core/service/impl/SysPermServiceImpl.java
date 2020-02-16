package com.heav.photographic.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.heav.photographic.core.common.mapper.BaseMapper;
import com.heav.photographic.core.common.service.impl.BaseServiceImpl;
import com.heav.photographic.core.mapper.SysPermMapper;
import com.heav.photographic.core.domain.SysPerm;
import com.heav.photographic.core.service.SysPermService;


/**
 * 自动发布产品编号ServiceImpl
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-05-30 14:28:29
 */
 
@Service("sysPermService")
public class SysPermServiceImpl extends BaseServiceImpl<SysPerm, Long> implements SysPermService {
	
    private static final Logger logger = LoggerFactory.getLogger(SysPermServiceImpl.class);
   
    @Resource
    private SysPermMapper sysPermMapper;

	@Override
	public BaseMapper<SysPerm, Long> getMapper() {
		return sysPermMapper;
	}

	@Override
	public List<SysPerm> listByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	
}