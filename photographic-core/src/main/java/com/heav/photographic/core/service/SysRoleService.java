package com.heav.photographic.core.service;

import java.util.List;

import com.heav.photographic.core.common.service.BaseService;
import com.heav.photographic.core.domain.SysRole;

/**
 * 角色信息Service
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-06-29 18:59:22
 */
public interface SysRoleService extends BaseService<SysRole, Long>{

	SysRole getRoleById(Integer roleId);

	List<SysRole> getRoleListByUserId(Long id);

}
