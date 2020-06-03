package com.luban.myAop;

import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {
	@Override
	public void query() {
		System.out.println("service query");
	}
}
