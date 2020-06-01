package com.luban.ConfigurationAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
@ComponentScan("com.luban.ConfigurationAnnotation")

public class Appconfig {

	@Bean
	public IndexDaoImpl getIndexDaoImpl(){
		return new IndexDaoImpl();
	}

	@Bean
	public IndexServiceImpl getIndexServiceImpl(){
		return new IndexServiceImpl();
	}

}
