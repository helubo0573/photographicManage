package com.heav.photographic.core.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.heav.photographic.core.common.constant.Constant;
import com.heav.photographic.core.common.exception.ServiceException;
import com.heav.photographic.core.common.mapper.BaseMapper;
import com.heav.photographic.core.common.service.impl.BaseServiceImpl;
import com.heav.photographic.core.mapper.SysMenuMapper;
import com.heav.photographic.core.mapper.UserInfoMapper;
import com.heav.photographic.core.domain.SysMenu;
import com.heav.photographic.core.domain.UserInfo;
import com.heav.photographic.core.service.UserInfoService;


/**
 * 自动发布产品编号ServiceImpl
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-05-29 11:47:20
 */
 
@Service("userInfoService")
public class UserInfoServiceImpl extends BaseServiceImpl<UserInfo, Long> implements UserInfoService {
	
    private static final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);
   
    @Resource
    private UserInfoMapper userInfoMapper;
    @Resource
    private SysMenuMapper sysMenuMapper;

	@Override
	public BaseMapper<UserInfo, Long> getMapper() {
		return userInfoMapper;
	}

	@Override
	public UserInfo getUserByUserName(String username){
			return userInfoMapper.getUserByUserName(username);
	}

	@Override
	public void editUserLoginInfo(UserInfo user) throws ServiceException {
		try
		{
			UserInfoMapper.editUserLoginInfo(user);
		} catch (Exception e)
		{
			throw new ServiceException(e.getMessage(), e, Constant.FAIL_CODE_VALUE);
		}
		
	}

	@Override
	public int editUserPassWord(UserInfo user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Object> UserRegister(String username, String password, String phone, String checkmsg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfo getUserByPhone(String phone) throws ServiceException {
		try {
			return userInfoMapper.getUserByPhone(phone);
		}catch(Exception e) {
			throw new ServiceException(e.getMessage(), e, Constant.FAIL_CODE_VALUE);
		}
	}

	@Override
	public int countUserByUserName(String username) throws ServiceException {
		return userInfoMapper.countUserByUserName(username);
	}

	@Override
	public int countUserByPhone(String phone) throws ServiceException {
		return userInfoMapper.countUserByPhone(phone);
	}

	@Override
	public List<SysMenu> getMenuByUserName(String username) {
		//return userInfoMapper.isadmin(username)?sysMenuMapper.getAllmenu():sysMenuMapper.getMenuByUserName(username);
		return sysMenuMapper.getAllmenu();
	}
	
}