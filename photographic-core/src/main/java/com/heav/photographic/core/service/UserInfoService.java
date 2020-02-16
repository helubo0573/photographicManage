package com.heav.photographic.core.service;

import java.util.List;
import java.util.Map;

import com.heav.photographic.core.common.exception.ServiceException;
import com.heav.photographic.core.common.service.BaseService;
import com.heav.photographic.core.domain.SysMenu;
import com.heav.photographic.core.domain.UserInfo;

/**
 * 自动发布产品编号Service
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-05-29 11:47:20
 */
public interface UserInfoService extends BaseService<UserInfo, Long>{
	
	UserInfo getUserByUserName(String username);
	
	UserInfo getUserByPhone(String phone) throws ServiceException;
	
	int countUserByUserName(String username) throws ServiceException;
	
	int countUserByPhone(String phone) throws ServiceException;
	
	void editUserLoginInfo(UserInfo user) throws ServiceException;
	
	int editUserPassWord(UserInfo user);
	
	List<SysMenu> getMenuByUserName(String username);
	
	Map<String, Object> UserRegister(String username,String password,String phone,String checkmsg);
}
