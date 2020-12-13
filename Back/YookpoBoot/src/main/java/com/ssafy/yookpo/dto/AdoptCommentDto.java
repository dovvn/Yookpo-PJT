package com.ssafy.yookpo.dto;

import java.util.Date;

public class AdoptCommentDto {
	private int ano;
	private int acno;
	private String actitle;
	private String accontent;
	private String acwriter;
	private Date acdate;
	
	public AdoptCommentDto() {}
	
	public AdoptCommentDto(int ano, int acno, String actitle, String accontent, String acwriter, Date acdate) {
		super();
		this.ano = ano;
		this.acno = acno;
		this.actitle = actitle;
		this.accontent = accontent;
		this.acwriter = acwriter;
		this.acdate = acdate;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getActitle() {
		return actitle;
	}
	public void setActitle(String actitle) {
		this.actitle = actitle;
	}
	public String getAccontent() {
		return accontent;
	}
	public void setAccontent(String accontent) {
		this.accontent = accontent;
	}
	public String getAcwriter() {
		return acwriter;
	}
	public void setAcwriter(String acwriter) {
		this.acwriter = acwriter;
	}
	public Date getAcdate() {
		return acdate;
	}
	public void setAcDate(Date acdate) {
		this.acdate = acdate;
	}
	@Override
	public String toString() {
		return "AdoptCommentDto [ano=" + ano + ", acno=" + acno + ", actitle=" + actitle + ", accontent=" + accontent
				+ ", acwriter=" + acwriter + ", acdate=" + acdate + "]";
	}
}
