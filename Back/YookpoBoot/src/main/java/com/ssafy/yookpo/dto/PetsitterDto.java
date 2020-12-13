package com.ssafy.yookpo.dto;

import java.util.Date;

public class PetsitterDto {
	private String uid;
	private int pno;
	private String ptitle;
	private String pcontent;
	private float pstar;
	private String phomepic;
	private Date pdate;
	
	public PetsitterDto() {}

	public PetsitterDto(String uid, int pno, String ptitle, String pcontent, float pstar, String phomepic, Date pdate) {
		super();
		this.uid = uid;
		this.pno = pno;
		this.ptitle = ptitle;
		this.pcontent = pcontent;
		this.pstar = pstar;
		this.phomepic = phomepic;
		this.pdate = pdate;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPtitle() {
		return ptitle;
	}

	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}

	public String getPcontent() {
		return pcontent;
	}

	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	}

	public float getPstar() {
		return pstar;
	}

	public void setPstar(float pstar) {
		this.pstar = pstar;
	}

	public String getPhomepic() {
		return phomepic;
	}

	public void setPhomepic(String phomepic) {
		this.phomepic = phomepic;
	}

	public Date getPdate() {
		return pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

	@Override
	public String toString() {
		return "PetsitterDto [uid=" + uid + ", pno=" + pno + ", ptitle=" + ptitle + ", pcontent=" + pcontent
				+ ", pstar=" + pstar + ", phomepic=" + phomepic + ", pdate=" + pdate + "]";
	}
}
