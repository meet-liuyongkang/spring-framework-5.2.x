package com.luban.myMybatis.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MapperInvocationHandler implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("这个handler不需要执行目标方法，只是为了生成代理对象而已，真正查询的是其中的SqlSessionTemplate");
		Class[] classes = new Class[args.length];
		for (int i = 0; i < args.length; i++) {
			classes[i] = args[i].getClass();
		}
		Method targetMethod = proxy.getClass().getInterfaces()[0].getMethod(method.getName(), classes);
		Select selectAnnotation = targetMethod.getAnnotation(Select.class);
		String sql = selectAnnotation.value();
		System.out.println(sql);
		return null;
	}
}
