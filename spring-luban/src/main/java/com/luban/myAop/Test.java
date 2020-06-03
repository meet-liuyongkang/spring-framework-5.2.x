package com.luban.myAop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		IndexService indexService = (IndexService) context.getBean("indexServiceImpl");
		indexService.query();
		System.out.println(indexService.getClass().getName()+"\n");

		IndexDaoImpl indexDaoImpl = (IndexDaoImpl) context.getBean("indexDaoImpl");
		indexDaoImpl.select();
		System.out.println(indexDaoImpl.getClass().getName()+"\n");
	}

}
