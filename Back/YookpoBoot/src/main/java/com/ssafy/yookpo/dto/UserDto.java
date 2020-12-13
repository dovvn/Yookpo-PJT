package com.ssafy.yookpo.dto;

public class UserDto {
	private String uid;
	private String upw;
	private String uname;
	private String uaddress;
	private int ulank;
	private String upicture;
	
	public UserDto() {}

	public UserDto(String uid, String upw, String uname, String uaddress, int ulank, String upicture) {
		super();
		this.uid = uid;
		this.upw = upw;
		this.uname = uname;
		this.uaddress = uaddress;
		this.ulank = ulank;
		this.upicture = upicture;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpw() {
		return upw;
	}

	public void setUpw(String upw) {
		this.upw = upw;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public int getUlank() {
		return ulank;
	}

	public void setUlank(int ulank) {
		this.ulank = ulank;
	}

	public String getUpicture() {
		return upicture;
	}

	public void setUpicture(String upicture) {
		this.upicture = upicture;
	}

	@Override
	public String toString() {
		return "UserDto [uid=" + uid + ", upw=" + upw + ", uname=" + uname + ", uaddress=" + uaddress + ", ulank="
				+ ulank + ", upicture=" + upicture + "]";
	}
}
