package com.luban.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessor1 implements BeanFactoryPostProcessor {


	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition userServiceImplBeanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("userServiceImpl");
		userServiceImplBeanDefinition.setAutowireMode(2);
		System.out.println("执行 postProcessBeanFactory1。 当前BeanDefinition 数量为："+beanFactory.getBeanDefinitionCount());
	}
}
