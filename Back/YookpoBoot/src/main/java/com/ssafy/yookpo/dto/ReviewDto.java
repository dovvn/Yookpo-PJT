package com.ssafy.yookpo.dto;

import java.util.Date;

public class ReviewDto {
	private int pno;
	private int rno;
	private String rtitle;
	private String rcontent;
	private int rstar;
	private Date rdate;
	
	public ReviewDto() {}

	public ReviewDto(int pno, int rno, String rtitle, String rcontent, int rstar, Date rdate) {
		super();
		this.pno = pno;
		this.rno = rno;
		this.rtitle = rtitle;
		this.rcontent = rcontent;
		this.rstar = rstar;
		this.rdate = rdate;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getRtitle() {
		return rtitle;
	}

	public void setRtitle(String rtitle) {
		this.rtitle = rtitle;
	}

	public String getRcontent() {
		return rcontent;
	}

	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}

	public int getRstar() {
		return rstar;
	}

	public void setRstar(int rstar) {
		this.rstar = rstar;
	}

	public Date getRdate() {
		return rdate;
	}

	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}

	@Override
	public String toString() {
		return "ReviewDto [pno=" + pno + ", rno=" + rno + ", rtitle=" + rtitle + ", rcontent=" + rcontent + ", rstar="
				+ rstar + ", rdate=" + rdate + "]";
	}
}
