package com.heav.photographic.core.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.heav.photographic.core.common.mapper.BaseMapper;
import com.heav.photographic.core.common.service.impl.BaseServiceImpl;
import com.heav.photographic.core.mapper.OrgDeptMapper;
import com.heav.photographic.core.domain.OrgDept;
import com.heav.photographic.core.service.OrgDeptService;


/**
 * 产品类型表ServiceImpl
 * 
 * @author stone
 * @version 1.0.0
 * @date 2020-02-26 10:25:53
 */
 
@Service("orgDeptService")
public class OrgDeptServiceImpl extends BaseServiceImpl<OrgDept, Long> implements OrgDeptService {
	
    private static final Logger logger = LoggerFactory.getLogger(OrgDeptServiceImpl.class);
   
    @Resource
    private OrgDeptMapper orgDeptMapper;

	@Override
	public BaseMapper<OrgDept, Long> getMapper() {
		return orgDeptMapper;
	}
	
}