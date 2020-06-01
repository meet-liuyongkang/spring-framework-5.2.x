package com.luban.ConfigurationAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Appconfig.class);
		context.refresh();

		IndexDaoImpl indexDaoImpl1 = (IndexDaoImpl) context.getBean(IndexDaoImpl.class);
		IndexDaoImpl indexDaoImpl2 = (IndexDaoImpl) context.getBean(IndexDaoImpl.class);
		System.out.println(indexDaoImpl1==indexDaoImpl2);
		CodeDaoImpl codeDaoImpl1 = context.getBean(CodeDaoImpl.class);
		CodeDaoImpl codeDaoImpl2 = context.getBean(CodeDaoImpl.class);
		System.out.println(codeDaoImpl1==codeDaoImpl2);

		Appconfig appconfig = (Appconfig) context.getBean("appconfig");
		AppconfigTemp appconfigTemp = (AppconfigTemp) context.getBean("appconfigTemp");
	}

}
