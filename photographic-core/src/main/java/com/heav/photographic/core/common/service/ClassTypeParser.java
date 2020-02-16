package com.heav.photographic.core.common.service;

public interface ClassTypeParser
{
	<T> T parse(String content, Class<T> valueType);
}
