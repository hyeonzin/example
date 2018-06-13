package com.ovely.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ovely.vo.WeekVO;


@Repository
public class WeekDao {

	@Autowired private SqlSession session;
	private static String namespace = "com.ovely.mappers.WeekMapper";
	
	public List<WeekVO> getWeek(WeekVO weekVO)
	{
		return session.selectList(namespace + ".getWeek", weekVO);
	}
	
}
