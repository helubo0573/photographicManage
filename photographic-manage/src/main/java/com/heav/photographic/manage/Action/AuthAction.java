package com.heav.photographic.manage.Action;

import com.heav.photographic.core.common.exception.ImgCodeException;

public class AuthAction {

	public static void checkImgCode(String code,Object object) {
		if(!code.equals(object)) {
			throw new ImgCodeException("验证码错误");
			
		}
	}
}
