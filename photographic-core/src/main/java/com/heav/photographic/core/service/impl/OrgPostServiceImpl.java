package com.heav.photographic.core.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.heav.photographic.core.common.mapper.BaseMapper;
import com.heav.photographic.core.common.service.impl.BaseServiceImpl;
import com.heav.photographic.core.mapper.OrgPostMapper;
import com.heav.photographic.core.domain.OrgPost;
import com.heav.photographic.core.service.OrgPostService;


/**
 * 产品类型表ServiceImpl
 * 
 * @author stone
 * @version 1.0.0
 * @date 2020-02-26 10:43:58
 */
 
@Service("orgPostService")
public class OrgPostServiceImpl extends BaseServiceImpl<OrgPost, Long> implements OrgPostService {
	
    private static final Logger logger = LoggerFactory.getLogger(OrgPostServiceImpl.class);
   
    @Resource
    private OrgPostMapper orgPostMapper;

	@Override
	public BaseMapper<OrgPost, Long> getMapper() {
		return orgPostMapper;
	}
	
}