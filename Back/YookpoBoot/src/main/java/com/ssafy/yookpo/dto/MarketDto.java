package com.ssafy.yookpo.dto;

import java.util.Date;

public class MarketDto {
	private String uid;
	private int mno;
	private String mcontent;
	private int mtype;
	private int mprice;
	private Date mdate;
	
	public MarketDto() {}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getMcontent() {
		return mcontent;
	}

	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}

	public int getMtype() {
		return mtype;
	}

	public void setMtype(int mtype) {
		this.mtype = mtype;
	}

	public int getMprice() {
		return mprice;
	}

	public void setMprice(int mprice) {
		this.mprice = mprice;
	}

	public Date getMdate() {
		return mdate;
	}

	public void setMdate(Date mdate) {
		this.mdate = mdate;
	}

	@Override
	public String toString() {
		return "MarketDto [uid=" + uid + ", mno=" + mno + ", mcontent=" + mcontent + ", mtype=" + mtype + ", mprice="
				+ mprice + ", mdate=" + mdate + "]";
	}
}
