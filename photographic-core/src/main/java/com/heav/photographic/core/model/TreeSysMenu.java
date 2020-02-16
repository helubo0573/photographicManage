package com.heav.photographic.core.model;

import java.io.Serializable;

import com.heav.photographic.core.domain.SysMenu;

public class TreeSysMenu extends SysMenu implements Serializable
{

	private static final long serialVersionUID = 1L;

	private int id;

	private String text;

	private int parentId;

	private String iconCls;

	private String scriptId;

	private boolean expanded;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getText()
	{
		return text;
	}

	public void setText(String text)
	{
		this.text = text;
	}

	public int getParentId()
	{
		return parentId;
	}

	public void setParentId(int parentId)
	{
		this.parentId = parentId;
	}

	public String getIconCls()
	{
		return iconCls;
	}

	public void setIconCls(String iconCls)
	{
		this.iconCls = iconCls;
	}

	public String getScriptId()
	{
		return scriptId;
	}

	public void setScriptId(String scriptId)
	{
		this.scriptId = scriptId;
	}

	public boolean isExpanded()
	{
		return expanded;
	}

	public void setExpanded(boolean expanded)
	{
		this.expanded = expanded;
	}

	public TreeSysMenu()
	{
		super();
	}

}
