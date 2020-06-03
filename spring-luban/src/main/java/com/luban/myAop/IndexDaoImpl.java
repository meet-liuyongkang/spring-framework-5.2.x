package com.luban.myAop;

import org.springframework.stereotype.Component;

@Component
public class IndexDaoImpl {

	public void select(){
		System.out.println("indexDaoImpl select");
	}

}
