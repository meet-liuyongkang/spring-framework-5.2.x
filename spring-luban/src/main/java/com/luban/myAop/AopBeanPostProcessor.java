package com.luban.myAop;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

public class AopBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		Object object;
		Class<?>[] interfaces = bean.getClass().getInterfaces();
		//Spring底层就是，当目标类实现了接口，则使用JDK的动态代理。如果目标类没有实现接口，则使用CGLIB动态代理
		if(interfaces != null && interfaces.length>0){
			object = Proxy.newProxyInstance(this.getClass().getClassLoader(), interfaces, new AopInvocationHandler(bean));
		}else{
			Enhancer enhancer = new Enhancer();
			enhancer.setSuperclass(bean.getClass());
			enhancer.setCallback(new AopMethodInterceptor());
			object = enhancer.create();
		}
		return object;
	}

}
