package com.luban.ImportSelector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 1.ImportSelector接口是spring提供给我们扩展spring的，只需要实现其中的selectImports方法，返回类的全命名的String数组，
 * Spring就会自动帮我们把这些类注册为BeanDefinition，继而创建相应的bean放入Spring容器中，但是这个方法只返回字符串数组，
 * 而注册成为BeanDefinition和Bean的过程是Spring自动完成的，所以我们不能修改这些类的BeanDefinition
 *
 * 2.但是实现ImportBeanDefinitionRegistrar接口的话，Spring会将register传入进来，让我们自己来注册，所以我们可以修改BeanDefinition
 */
public class MyImportSelector implements ImportSelector{
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		System.out.println(IndexDaoImpl.class.getName());
		System.out.println(IndexDaoImpl.class.getSimpleName());
		return new String[]{IndexDaoImpl.class.getName()};
	}
}
