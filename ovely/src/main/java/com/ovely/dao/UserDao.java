package com.ovely.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ovely.vo.UserVO;

@Repository
public class UserDao {

	@Autowired private SqlSession session;
	private static String namespace = "com.ovely.mappers.UserMapper";
	
	public void create(UserVO userVO)
	{
		session.insert(namespace + ".create", userVO);
	}
	
	public List<UserVO> read()
	{
		return session.selectList(namespace + ".read");
	}
}
