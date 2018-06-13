package com.ovely.vo;

public class UserVO {
	
	private int cash_key;
	private String id;
	private String pw;
	private String nickname;
	private String uuid;
	private int point;
	private String profile_img;
	private int id_group;
	
	public UserVO() {}
	public UserVO(int cash_key, String id, String pw, String nickname, String uuid, int point, String profile_img, int id_group)
	{
		this.setCash_key(cash_key);
		this.setId(id);
		this.setPw(pw);
		this.setNickname(nickname);
		this.setUuid(uuid);
		this.setPoint(point);
		this.setProfile_img(profile_img);
		this.setId_group(id_group);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCash_key() {
		return cash_key;
	}

	public void setCash_key(int cash_key) {
		this.cash_key = cash_key;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getProfile_img() {
		return profile_img;
	}

	public void setProfile_img(String profile_img) {
		this.profile_img = profile_img;
	}

	public int getId_group() {
		return id_group;
	}

	public void setId_group(int id_group) {
		this.id_group = id_group;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
}
