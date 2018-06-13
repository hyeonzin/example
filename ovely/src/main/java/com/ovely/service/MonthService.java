package com.ovely.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ovely.dao.MonthDao;
import com.ovely.vo.MonthVO;


@Service
public class MonthService {

@Autowired private MonthDao monthDao;
	
	public List<MonthVO> getMonth(MonthVO monthVO)
	{
		return monthDao.getMonth(monthVO);
	}

}
