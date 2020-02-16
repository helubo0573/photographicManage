package com.heav.photographic.core.common.service;

import org.apache.ibatis.javassist.tools.rmi.ObjectNotFoundException;

public interface ObjectFactory<T>
{

	T getObject(Object qualifier) throws ObjectNotFoundException;
}
