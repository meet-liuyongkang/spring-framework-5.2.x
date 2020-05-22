package com.luban.postProcessor;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class UserServiceImpl {

	public UserServiceImpl(){
		System.out.println("构造方法");
	}

	public void test(){
		System.out.println("userService test");
	}

	@PostConstruct
	public void init(){
		System.out.println("userService init");
	}

	@PreDestroy
	public void destroy(){
		System.out.println("userService destroy");
	}

}
