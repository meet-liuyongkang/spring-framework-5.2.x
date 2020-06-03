package com.luban.myMybatis.test;

import com.luban.myMybatis.dao.UserMapper;
import com.luban.myMybatis.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
		userServiceImpl.query("张三");
	}

}
