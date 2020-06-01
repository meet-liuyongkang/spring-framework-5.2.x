package com.luban.ConfigurationAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Controller
public class AppconfigTemp {

	@Bean
	public CodeDaoImpl getCodeDaoImpl(){
		return new CodeDaoImpl();
	}

}
