package com.ssafy.yookpo.dto;

import java.util.Date;

public class AdoptDto {
	private String uid;
	private int ano;
	private String atitle;
	private String acontent;
	private String apicture;
	private int acnt;
	private Date adate;
	
	public AdoptDto() {}
	
	public AdoptDto(String uid, int ano, String atitle, String acontent, String apicture, int acnt, Date adate) {
		super();
		this.uid = uid;
		this.ano = ano;
		this.atitle = atitle;
		this.acontent = acontent;
		this.apicture = apicture;
		this.acnt = acnt;
		this.adate = adate;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getAtitle() {
		return atitle;
	}
	public void setAtitle(String atitle) {
		this.atitle = atitle;
	}
	public String getAcontent() {
		return acontent;
	}
	public void setAcontent(String acontent) {
		this.acontent = acontent;
	}
	public String getApicture() {
		return apicture;
	}
	public void setApicture(String apicture) {
		this.apicture = apicture;
	}
	public int getAcnt() {
		return acnt;
	}
	public void setAcnt(int acnt) {
		this.acnt = acnt;
	}
	public Date getAdate() {
		return adate;
	}
	public void setAdate(Date date) {
		this.adate = date;
	}

	@Override
	public String toString() {
		return "AdoptDto [uid=" + uid + ", ano=" + ano + ", atitle=" + atitle + ", acontent=" + acontent + ", apicture="
				+ apicture + ", acnt=" + acnt + ", adate=" + adate + "]";
	}
}
