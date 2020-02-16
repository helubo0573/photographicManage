package com.heav.photographic.core.common.util;

import com.github.pagehelper.Page;

public class RdPage
{

	public static final int PAGE_NUM_DEFAULT = 1;

	public static final int PAGE_SIZE_DEFAULT = 10;

	private long total;

	private int pages;

	private int current;

	private int pageSize;

	// private int startRow;

	// private int endRow;

	public RdPage()
	{
		super();
	}

	public RdPage(Page<?> page)
	{
		this.total = page.getTotal();
		this.pages = page.getPages();
		this.current = page.getPageNum();
		this.pageSize = page.getPageSize();
		// this.startRow = page.getStartRow();
		// this.endRow = page.getEndRow();
	}

	public boolean hasPre()
	{
		if (pages > 1 && current > 1)
		{
			return true;
		}
		return false;
	}

	public boolean hasNext()
	{
		if (pages > 1 && current < pages)
		{
			return true;
		}
		return false;
	}

	public long getTotal()
	{
		return total;
	}

	public void setTotal(long total)
	{
		this.total = total;
	}

	public int getPages()
	{
		return pages;
	}

	public void setPages(int pages)
	{
		this.pages = pages;
	}

	public int getCurrent()
	{
		return current == 0 ? PAGE_NUM_DEFAULT : current;
	}

	public void setCurrent(int current)
	{
		this.current = current;
	}

	public int getPageSize()
	{
		return pageSize == 0 ? PAGE_SIZE_DEFAULT : pageSize;
	}

	public void setPageSize(int pageSize)
	{
		this.pageSize = pageSize;
	}
}
