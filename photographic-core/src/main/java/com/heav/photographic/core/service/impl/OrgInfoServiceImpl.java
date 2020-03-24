package com.heav.photographic.core.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.heav.photographic.core.common.mapper.BaseMapper;
import com.heav.photographic.core.common.service.impl.BaseServiceImpl;
import com.heav.photographic.core.mapper.OrgInfoMapper;
import com.heav.photographic.core.domain.OrgInfo;
import com.heav.photographic.core.service.OrgInfoService;


/**
 * 产品类型表ServiceImpl
 * 
 * @author stone
 * @version 1.0.0
 * @date 2020-03-16 15:23:04
 */
 
@Service("orgInfoService")
public class OrgInfoServiceImpl extends BaseServiceImpl<OrgInfo, Long> implements OrgInfoService {
	
    private static final Logger logger = LoggerFactory.getLogger(OrgInfoServiceImpl.class);
   
    @Resource
    private OrgInfoMapper orgInfoMapper;

	@Override
	public BaseMapper<OrgInfo, Long> getMapper() {
		return orgInfoMapper;
	}
	
}