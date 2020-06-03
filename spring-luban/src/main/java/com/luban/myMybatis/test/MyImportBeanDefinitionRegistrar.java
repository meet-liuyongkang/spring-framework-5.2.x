package com.luban.myMybatis.test;

import com.luban.myMybatis.dao.UserMapper;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		 //1.首先得到BeanDefinition，得到BeanDefinition需要先得到class,mybatis是通过@MapperScan注解里面，继承spring的扫描器，然后扫描包，
		 //然后得到扫描的所有class，这里我就直接给定一个
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(UserMapper.class);
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();
		beanDefinition.setBeanClass(MapperBeanFactory.class);
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(UserMapper.class.getName());
		registry.registerBeanDefinition("userMapper", beanDefinition);
	}

	//不能重写这个方法，否则上面的方法不会被调用，原因暂时不知道
/*	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {

	}*/
}
