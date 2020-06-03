package com.luban.myAop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AopInvocationHandler implements InvocationHandler {

	private Object target;

	public AopInvocationHandler(Object target){
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("这是模拟SpringAop  JDK动态代理 before");
		Object object = method.invoke(target, args);
		System.out.println("这是模拟SpringAop  JDK动态代理 after");
		return object;
	}
}
