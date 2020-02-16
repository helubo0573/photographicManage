package com.heav.photographic.core.common.util;

import java.util.Map;

import tool.util.NumberUtil;
import tool.util.StringUtil;

/**
 * 	全局变量
 * @author Administrator
 *
 */
public class Global {
	public static Map<String, Object> configMap;

	public static Map<String, Object> msg_template_Map;

	
	public static void setString(String key,String value) {
		configMap.put(key, value);
	}
	
	public static int getInt(String key)
	{
		return NumberUtil.getInt(StringUtil.isNull(configMap.get(key)));
	}

	public static double getDouble(String key)
	{
		return NumberUtil.getDouble(StringUtil.isNull(configMap.get(key)));
	}

	public static String getValue(String key)
	{
		return StringUtil.isNull(configMap.get(key));
	}

	public static Object getObject(String key)
	{
		return configMap.get(key);
	}

	public static String getMsgTempLate(String key)
	{
		return StringUtil.isNull(msg_template_Map.get(key));
	}
}
