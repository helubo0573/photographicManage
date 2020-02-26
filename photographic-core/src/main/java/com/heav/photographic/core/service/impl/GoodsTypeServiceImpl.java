package com.heav.photographic.core.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.heav.photographic.core.common.mapper.BaseMapper;
import com.heav.photographic.core.common.service.impl.BaseServiceImpl;
import com.heav.photographic.core.mapper.GoodsTypeMapper;
import com.heav.photographic.core.domain.GoodsType;
import com.heav.photographic.core.service.GoodsTypeService;


/**
 * 产品类型表ServiceImpl
 * 
 * @author stone
 * @version 1.0.0
 * @date 2020-02-26 10:23:11
 */
 
@Service("goodsTypeService")
public class GoodsTypeServiceImpl extends BaseServiceImpl<GoodsType, Long> implements GoodsTypeService {
	
    private static final Logger logger = LoggerFactory.getLogger(GoodsTypeServiceImpl.class);
   
    @Resource
    private GoodsTypeMapper goodsTypeMapper;

	@Override
	public BaseMapper<GoodsType, Long> getMapper() {
		return goodsTypeMapper;
	}
	
}