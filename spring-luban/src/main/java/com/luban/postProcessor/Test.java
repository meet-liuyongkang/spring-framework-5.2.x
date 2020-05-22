package com.luban.postProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		//AnnotationConfigApplicationContext就是spring环境，也叫spring上下文环境，git测试一下嘿嘿
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppconfigOnlyBean.class);
		context.register(UserServiceImpl.class);
	}

}
