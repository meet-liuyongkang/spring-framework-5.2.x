package com.luban.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		UserService userService = (UserService) context.getBean("userService");
		userService.test();
	}

}
