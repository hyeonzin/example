package com.ovely.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ovely.service.MonthService;
import com.ovely.service.UserService;
import com.ovely.service.WeekService;
import com.ovely.vo.MonthVO;
import com.ovely.vo.UserVO;
import com.ovely.vo.WeekVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired UserService userService;
	@Autowired WeekService weekService;
	@Autowired MonthService monthService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		return "home";
	}
	
	@GetMapping(value="findId")
	public ResponseEntity<?> readOne(UserVO user)
	{
		return new ResponseEntity<>(userService.readOne(user.getId()), HttpStatus.OK);
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public ResponseEntity<?> join( UserVO user)throws Exception {
		//byte[]로 변환-> decoding -> 파일 저장, 경로를 user.profile_img에
		Decoder decoder=Base64.getMimeDecoder();
		
		String user_img=user.getProfile_img();
		System.out.println(user_img);
		byte [] user_img_byte=decoder.decode(new String(user_img).getBytes("UTF-8"));
		System.out.println(new String(user_img_byte));
		
		//ByteArrayInputStream inputStream=new ByteArrayInputStream(user_img_byte);
		//BufferedImage bufferedImage=new ImageIO.read(inputStream);
		//ImageIO.write(bufferedImage,"png",new File("파일경로"));
		//user.setProfile_img("파일경로");
		user.setProfile_img("null");
		user.setPoint(0);
		userService.create(user);
		System.out.println("Join method/ id : "+user.getId()+" nickname : "+user.getNickname());
		return new ResponseEntity<>(userService.readOne(user.getId()), HttpStatus.OK);
	}
	
	@RequestMapping(value="checkId",method=RequestMethod.GET)
	public @ResponseBody String CheckId(UserVO user) throws IOException {
		
		if(userService.readOne(user.getId())==null) {
			return "true";
		}
		else return "false";
		
	}
	@RequestMapping(value="checkNick",method=RequestMethod.GET)
	public @ResponseBody String CheckNick(UserVO user) throws IOException{
		if(userService.readNick(user.getNickname())==null) {
			return "true";
		}
		else
			return "false";
	}
	
	@RequestMapping(value="/getWeek",method=RequestMethod.GET)
	public ResponseEntity<?> getWeek( WeekVO week){
		
		int week_total=0;
		int week_good=0;
		int week_front=0;
		int week_leg=0;
		int week_lean=0;
		int week_rest=0;
		Map<String, Object> map = new HashMap<String, Object>();
		List<WeekVO> weekvo=weekService.getWeek(week);
		
		for(int i=0;i<weekvo.size();i++) {
			week_total+=weekvo.get(i).getWeek_total();
			week_good+=weekvo.get(i).getWeek_good();
			week_front+=weekvo.get(i).getWeek_front();
			week_leg+=weekvo.get(i).getWeek_leg();
			week_lean+=weekvo.get(i).getWeek_lean();
			week_rest+=weekvo.get(i).getWeek_rest();
		}
	
    	map.put("week_good", week_good);
    	map.put("week_good_per", String.format("%.2f", (float)week_good*100/week_total));
    	map.put("week_front", week_front);
    	map.put("week_front_per", String.format("%.2f", (float)week_front*100/week_total));
    	map.put("week_leg", week_leg);
    	map.put("week_leg_per", String.format("%.2f", (float)week_leg*100/week_total));
    	map.put("week_lean", week_lean);
    	map.put("week_lean_per", String.format("%.2f", (float) week_lean*100/week_total));
    	map.put("week_rest", week_rest);
    	map.put("week_rest_per", String.format("%.2f", (float)week_rest*100/week_total));

		return  new ResponseEntity<>(map, HttpStatus.OK);
	}
	
	@RequestMapping(value="/getMonthDonut",method=RequestMethod.GET)
	public ResponseEntity<?> getMonthDonut(MonthVO month){
		
		int month_total=0;
		int month_good=0;
		int month_front=0;
		int month_leg=0;
		int month_lean=0;
		int month_rest=0;
		Map<String, Object> map = new HashMap<String, Object>();
		List<MonthVO> monthvo=monthService.getMonth(month);
		
		for(int i=0;i<monthvo.size();i++) {
			month_total+=monthvo.get(i).getMonth_total();
			month_good+=monthvo.get(i).getMonth_good();
			month_front+=monthvo.get(i).getMonth_front();
			month_leg+=monthvo.get(i).getMonth_leg();
			month_lean+=monthvo.get(i).getMonth_lean();
			month_rest+=monthvo.get(i).getMonth_rest();
		}
	
    	map.put("month_good", month_good);
    	map.put("month_good_per", String.format("%.2f", (float)month_good*100/month_total));
    	map.put("month_front", month_front);
    	map.put("month_front_per", String.format("%.2f", (float)month_front*100/month_total));
    	map.put("month_leg", month_leg);
    	map.put("month_leg_per", String.format("%.2f", (float)month_leg*100/month_total));
    	map.put("month_lean", month_lean);
    	map.put("month_lean_per", String.format("%.2f", (float) month_lean*100/month_total));
    	map.put("month_rest", month_rest);
    	map.put("month_rest_per", String.format("%.2f", (float)month_rest*100/month_total));

		return  new ResponseEntity<>(map, HttpStatus.OK);
	}
	
	@RequestMapping(value="/getMonthLine",method=RequestMethod.GET)
	public ResponseEntity<?> getMonthLine(MonthVO month){
		
		int month_total=0;
		int month_good=0;
		int month_front=0;
		int month_leg=0;
		int month_lean=0;
		int month_rest=0;
		Map<String, Object> map = new HashMap<String, Object>();
		List<MonthVO> monthvo=monthService.getMonth(month);
		
		for(int i=0;i<monthvo.size();i++) {
			month_total+=monthvo.get(i).getMonth_total();
			month_good+=monthvo.get(i).getMonth_good();
			month_front+=monthvo.get(i).getMonth_front();
			month_leg+=monthvo.get(i).getMonth_leg();
			month_lean+=monthvo.get(i).getMonth_lean();
			month_rest+=monthvo.get(i).getMonth_rest();
		}
	
    	map.put("month_good", month_good);
    	map.put("month_front", month_front);
    	map.put("month_leg", month_leg);
    	map.put("month_lean", month_lean);
    	map.put("month_rest", month_rest);
    	
		return  new ResponseEntity<>(map, HttpStatus.OK);
	}
}
