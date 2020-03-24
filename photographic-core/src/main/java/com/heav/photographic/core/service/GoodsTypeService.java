package com.heav.photographic.core.service;

import java.util.List;
import java.util.Map;

import com.heav.photographic.core.common.exception.ServiceException;
import com.heav.photographic.core.common.service.BaseService;
import com.heav.photographic.core.domain.GoodsType;

/**
 * 产品类型表Service
 * 
 * @author stone
 * @version 1.0.0
 * @date 2020-02-26 10:23:11
 */
public interface GoodsTypeService extends BaseService<GoodsType, Long>{

	List<GoodsType> getTypeList(Map<String, Object> params) throws ServiceException;
	
	List<GoodsType> getParentByOrg(int integer);
}
