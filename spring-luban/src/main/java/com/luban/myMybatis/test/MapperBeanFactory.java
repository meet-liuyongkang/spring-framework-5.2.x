package com.luban.myMybatis.test;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

public class MapperBeanFactory implements FactoryBean {

	private Class clazz;

	public MapperBeanFactory(Class clazz){
		this.clazz = clazz;
	}

	@Override
	public Object getObject() throws Exception {
		Object object = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{clazz}, new MapperInvocationHandler());
		return object;
	}

	@Override
	public Class<?> getObjectType() {
		return clazz;
	}
}
