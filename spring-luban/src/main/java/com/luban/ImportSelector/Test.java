package com.luban.ImportSelector;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Appconfig.class);
		context.refresh();

		IndexDaoImpl indexDaoImpl = (IndexDaoImpl) context.getBean(IndexDaoImpl.class);
		IndexServiceImpl indexServiceImpl = (IndexServiceImpl) context.getBean("indexServiceImpl");
		indexDaoImpl.query("张三");
	}

}
