package com.heav.photographic.core.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiresPermission
{

	String code();

	String name();
}
