package com.luban.myMybatis.dao;

import com.luban.myMybatis.test.Select;

public interface UserMapper {

	@Select("select * from user")
	public void selectUser(String name);

}
