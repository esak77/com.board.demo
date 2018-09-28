package com.sntkor.domain;

public class IdcVO {
	private int idx;
	private String company;
	private String vender;
	
	public IdcVO() {
		super();
	}

	public IdcVO(int idx, String company, String vender) {
		super();
		this.idx = idx;
		this.company = company;
		this.vender = vender;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getVender() {
		return vender;
	}

	public void setVender(String vender) {
		this.vender = vender;
	}

	@Override
	public String toString() {
		return "IdcVO [idx=" + idx + ", company=" + company + ", vender=" + vender + "]";
	}
	
	
}
