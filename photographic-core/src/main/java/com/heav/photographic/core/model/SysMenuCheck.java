package com.heav.photographic.core.model;

import java.util.List;

import com.heav.photographic.core.domain.SysMenu;


public class SysMenuCheck extends SysMenu
{

	private static final long serialVersionUID = 73161925067707896L;

	private boolean checked;

	private List<SysMenuCheck> children;

	public List<SysMenuCheck> getChildren()
	{
		return children;
	}

	public void setChildren(List<SysMenuCheck> children)
	{
		this.children = children;
	}

	public boolean isChecked()
	{
		return checked;
	}

	public void setChecked(boolean checked)
	{
		this.checked = checked;
	}

	public SysMenuCheck()
	{

	}
}
