package com.luban.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

@Component
public class MyPostProcessor1 implements BeanPostProcessor, PriorityOrdered, ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if("userServiceImpl".equals(beanName)){
			System.out.println("userService impl BeanPostProcessor init before1");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if("userServiceImpl".equals(beanName)){
			System.out.println("userService impl BeanPostProcessor init after1");
		}
		return bean;
	}

	//修改BeanPostProcessor的执行顺序
	@Override
	public int getOrder() {
		return 101;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
