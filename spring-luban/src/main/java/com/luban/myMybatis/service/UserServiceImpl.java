package com.luban.myMybatis.service;


import com.luban.myMybatis.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public void query(String name) {
		userMapper.selectUser(name);
	}
}
