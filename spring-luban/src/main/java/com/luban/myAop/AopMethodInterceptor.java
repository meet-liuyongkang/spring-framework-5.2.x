package com.luban.myAop;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class AopMethodInterceptor implements MethodInterceptor {
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("这是模拟SpringAop  CGLIB动态代理 before");
		Object object = methodProxy.invokeSuper(o,objects);
		System.out.println("这是模拟SpringAop  CGLIB动态代理 after");
		return object;
	}
}
