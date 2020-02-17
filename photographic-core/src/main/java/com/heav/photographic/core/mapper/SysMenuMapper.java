package com.heav.photographic.core.mapper;

import java.util.List;

import com.heav.photographic.core.common.mapper.BaseMapper;
import com.heav.photographic.core.common.mapper.RDBatisDao;
import com.heav.photographic.core.domain.SysMenu;

/**
 * 用户角色信息映射Dao
 * 
 * @author stone
 * @version 1.0.0
 * @date 2020-02-16 18:55:12
 */
@RDBatisDao
public interface SysMenuMapper extends BaseMapper<SysMenu, Long> {

	List<SysMenu> getMenuByUserName(String user);
    
    List<SysMenu> getAllmenu();

}
