package com.ovely.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ovely.vo.MonthVO;

@Repository
public class MonthDao {
	@Autowired private SqlSession session;
	private static String namespace = "com.ovely.mappers.MonthMapper";
	
	public List<MonthVO> getMonth(MonthVO monthVO)
	{
		return session.selectList(namespace + ".getMonth", monthVO);
	}
	
}
