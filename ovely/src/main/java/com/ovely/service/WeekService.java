package com.ovely.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ovely.dao.WeekDao;
import com.ovely.vo.WeekVO;

@Service
public class WeekService {
	
	@Autowired private WeekDao weekDao;
	
	public List<WeekVO> getWeek(WeekVO weekVO)
	{
		return weekDao.getWeek(weekVO);
	}

}
