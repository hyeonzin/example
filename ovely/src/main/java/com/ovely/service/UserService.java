package com.ovely.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ovely.dao.UserDao;
import com.ovely.vo.UserVO;

@Service
public class UserService {

	@Autowired private UserDao userDao;
	
	public void create(UserVO userVO)
	{
		userDao.create(userVO);
	}
	
	public List<UserVO> read()
	{
		return userDao.read();
	}
	
	public UserVO readOne(String id)
	{
		return userDao.readOne(id);
	}
	public UserVO readNick(String nickname) 
	{
		return userDao.readNick(nickname);
	}
}
