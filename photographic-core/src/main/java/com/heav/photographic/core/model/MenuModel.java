package com.heav.photographic.core.model;

import com.heav.photographic.core.domain.SysMenu;

public class MenuModel extends SysMenu
{

	private static final long serialVersionUID = -616526029044963364L;

	private int roleId;

	public int getRoleId()
	{
		return roleId;
	}
	
	public String getRoleIDtostr() {
		return Integer.toString(roleId);
	}
	public void setRoleId(int roleId)
	{
		this.roleId = roleId;
	}

	public String getHref() {
		// TODO Auto-generated method stub
		return null;
	}
}
