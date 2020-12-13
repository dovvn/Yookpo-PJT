package com.ssafy.yookpo.dto;

public class BasketDto {
	private int mno;
	private String uid;
	private int bkno;
	
	public BasketDto() {}

	public BasketDto(int mno, String uid, int bkno) {
		super();
		this.mno = mno;
		this.uid = uid;
		this.bkno = bkno;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public int getBkno() {
		return bkno;
	}

	public void setBkno(int bkno) {
		this.bkno = bkno;
	}
}
