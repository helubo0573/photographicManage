package com.heav.photographic.core.service;

import java.util.List;

import com.heav.photographic.core.common.service.BaseService;
import com.heav.photographic.core.domain.SysPerm;

/**
 * 自动发布产品编号Service
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-05-30 14:28:29
 */
public interface SysPermService extends BaseService<SysPerm, Long>{

	List<SysPerm> listByUserName(String username);
}
