package com.ovely.vo;

public class WeekVO {

	private int cash_key;	//계정 고유값
	private int week_num;	//몇번째 주
	private int week_day;	//요일
	private int month;		//달
	private int year;		//년
	private int week_total;	//총 앉은시간
	private int week_good;	//바른자세시간
	private int week_bad;	//나쁜자세시간
	private int week_percent;//앉은시간 대비 바른자세시간
	private int week_front;//앞으로 굽은 시간
	private int week_leg;//다리 꼰 시간
	private int week_lean;//뒤로 기댄 시간
	private int week_rest;//나머지 기타 나쁜 자세 시간
	
	public WeekVO() {
		
	}
	public WeekVO(int cash_key, int week_num,int week_day, int month,int year,
			int week_total, int week_good, int week_bad, int week_percent, int week_front,
			int week_leg, int week_lean, int week_rest){
		
		this.cash_key=cash_key;
		this.week_num=week_num;
		this.setWeek_day(week_day);
		this.setMonth(month);
		this.setYear(year);
		this.setWeek_total(week_total);
		this.setWeek_good(week_good);
		this.setWeek_bad(week_bad);
		this.setWeek_percent(week_percent);
		this.setWeek_front(week_front);
		this.setWeek_leg(week_leg);
		this.setWeek_lean(week_lean);
		this.setWeek_rest(week_rest);
		
	}
	public int getCash_key() {
		return cash_key;
	}
	public void setCash_key(int cash_key) {
		this.cash_key = cash_key;
	}
	public int getWeek_num() {
		return week_num;
	}
	public void setWeek_num(int week_num) {
		this.week_num = week_num;
	}
	public int getWeek_day() {
		return week_day;
	}
	public void setWeek_day(int week_day) {
		this.week_day = week_day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getWeek_total() {
		return week_total;
	}
	public void setWeek_total(int week_total) {
		this.week_total = week_total;
	}
	public int getWeek_good() {
		return week_good;
	}
	public void setWeek_good(int week_good) {
		this.week_good = week_good;
	}
	public int getWeek_bad() {
		return week_bad;
	}
	public void setWeek_bad(int week_bad) {
		this.week_bad = week_bad;
	}
	public int getWeek_percent() {
		return week_percent;
	}
	public void setWeek_percent(int week_percent) {
		this.week_percent = week_percent;
	}
	public int getWeek_front() {
		return week_front;
	}
	public void setWeek_front(int week_front) {
		this.week_front = week_front;
	}
	public int getWeek_leg() {
		return week_leg;
	}
	public void setWeek_leg(int week_leg) {
		this.week_leg = week_leg;
	}
	public int getWeek_lean() {
		return week_lean;
	}
	public void setWeek_lean(int week_lean) {
		this.week_lean = week_lean;
	}
	public int getWeek_rest() {
		return week_rest;
	}
	public void setWeek_rest(int week_rest) {
		this.week_rest = week_rest;
	}
}
