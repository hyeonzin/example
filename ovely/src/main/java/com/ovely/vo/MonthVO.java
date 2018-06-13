package com.ovely.vo;

public class MonthVO {

	private int cash_key;	//계정 고유값
	private int week_num;	//몇번째 주
	private int month;		//달
	private int year;		//년
	private int month_total;	//총 앉은시간
	private int month_good;	//바른자세시간
	private int month_bad;	//나쁜자세시간
	private int month_percent;//앉은시간 대비 바른자세시간
	private int month_front;//앞으로 굽은 시간
	private int month_leg;//다리 꼰 시간
	private int month_lean;//뒤로 기댄 시간
	private int month_rest;//나머지 기타 나쁜 자세 시간
	
	public MonthVO() {
		
	}

	public MonthVO(int cash_key, int week_num, int month, int year, int month_total, int month_good, int month_bad,
			int month_percent, int month_front, int month_leg, int month_lean, int month_rest) {
		super();
		this.cash_key = cash_key;
		this.week_num = week_num;
		this.month = month;
		this.year = year;
		this.month_total = month_total;
		this.month_good = month_good;
		this.month_bad = month_bad;
		this.month_percent = month_percent;
		this.month_front = month_front;
		this.month_leg = month_leg;
		this.month_lean = month_lean;
		this.month_rest = month_rest;
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

	public int getMonth_total() {
		return month_total;
	}

	public void setMonth_total(int month_total) {
		this.month_total = month_total;
	}

	public int getMonth_good() {
		return month_good;
	}

	public void setMonth_good(int month_good) {
		this.month_good = month_good;
	}

	public int getMonth_bad() {
		return month_bad;
	}

	public void setMonth_bad(int month_bad) {
		this.month_bad = month_bad;
	}

	public int getMonth_percent() {
		return month_percent;
	}

	public void setMonth_percent(int month_percent) {
		this.month_percent = month_percent;
	}

	public int getMonth_front() {
		return month_front;
	}

	public void setMonth_front(int month_front) {
		this.month_front = month_front;
	}

	public int getMonth_leg() {
		return month_leg;
	}

	public void setMonth_leg(int month_leg) {
		this.month_leg = month_leg;
	}

	public int getMonth_lean() {
		return month_lean;
	}

	public void setMonth_lean(int month_lean) {
		this.month_lean = month_lean;
	}

	public int getMonth_rest() {
		return month_rest;
	}

	public void setMonth_rest(int month_rest) {
		this.month_rest = month_rest;
	}
	
}
