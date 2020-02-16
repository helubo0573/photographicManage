package com.heav.photographic.core.mapper;

import java.util.List;

import com.heav.photographic.core.common.mapper.BaseMapper;
import com.heav.photographic.core.common.mapper.RDBatisDao;
import com.heav.photographic.core.domain.SysMenu;

/**
 * 自动发布产品编号Dao
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-05-29 11:06:27
 */
@RDBatisDao
public interface SysMenuMapper extends BaseMapper<SysMenu, Long> {

    List<SysMenu> getMenuByUserName(String user);
    
    List<SysMenu> getAllmenu();

}
