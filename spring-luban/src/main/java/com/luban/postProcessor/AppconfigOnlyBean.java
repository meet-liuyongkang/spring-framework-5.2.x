package com.luban.postProcessor;

import org.springframework.context.annotation.Bean;

public class AppconfigOnlyBean {

	@Bean
	public UserServiceImpl getUserServiceImpl(){
		return new UserServiceImpl();
	}

}
