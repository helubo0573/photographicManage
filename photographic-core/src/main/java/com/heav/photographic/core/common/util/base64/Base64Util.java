package com.heav.photographic.core.common.util.base64;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.heav.photographic.core.common.util.StringUtil;


public class Base64Util
{

	public static final Logger logger = LoggerFactory.getLogger(Base64Util.class);

	public static String base64Encode(String str)
	{
		Base64Encoder encoder = new Base64Encoder();
		String result = encoder.encode(str.getBytes());
		return result;
	}

	public static String base64Encode(byte[] b)
	{
		Base64Encoder encoder = new Base64Encoder();
		String result = encoder.encode(b);
		return result;
	}

	public static String base64Decode(String str)
	{
		try
		{
			if (StringUtil.isNotBlank(str))
			{
				Base64Decoder decoder = new Base64Decoder();
				String result = decoder.decodeStr(str);
				return result;
			} else
			{
				return null;
			}
		} catch (IOException e)
		{
			logger.error(e.getMessage(), e);
		}
		return "";
	}

	public static byte[] base64DecodeToArray(String str)
	{
		try
		{
			if (StringUtil.isNotBlank(str))
			{
				Base64Decoder decoder = new Base64Decoder();
				return decoder.decodeBuffer(str);
			} else
			{
				return null;
			}
		} catch (IOException e)
		{
			logger.error(e.getMessage(), e);
		}
		return null;
	}
}
