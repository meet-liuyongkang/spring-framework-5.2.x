package com.luban.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

@Component
public class MyPostProcessor2 implements BeanPostProcessor, PriorityOrdered {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if("userServiceImpl".equals(beanName)){
			System.out.println("userService impl BeanPostProcessor init before2");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if("userServiceImpl".equals(beanName)){
			System.out.println("userService impl BeanPostProcessor init after2");
		}
		return bean;
	}

	@Override
	public int getOrder() {
		return 100;
	}
}
