package com.ovely.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ovely.service.UserService;
import com.ovely.vo.UserVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		UserVO userVO1 = new UserVO("ovely", "hyunjin");
		userService.create(userVO1);
		System.out.println("userVO1 insert success" + userVO1.getId());
		
		UserVO userVO2 = userService.read().get(0);
		System.out.println("userVO2 read success" + userVO2.getId());
		System.out.println(userVO2.getId());
		System.out.println(userVO2.getName());
		
		return "home";
	}
	
}
