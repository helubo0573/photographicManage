package com.heav.photographic.core.mapper;

import com.heav.photographic.core.common.mapper.BaseMapper;
import com.heav.photographic.core.common.mapper.RDBatisDao;
import com.heav.photographic.core.domain.UserInfo;

/**
 * 自动发布产品编号Dao
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-05-29 11:47:20
 */
@RDBatisDao
public interface UserInfoMapper extends BaseMapper<UserInfo, Long> {

	UserInfo getUserByUserName(String username);
	
	UserInfo getUserByPhone(String phone);
	
	int countUserByUserName(String username);
	
	int countUserByPhone(String phone);
	
	boolean isadmin(String username);
	
	static void editUserLoginInfo(UserInfo user) {
		
	}


}
