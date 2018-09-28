package com.board.domain;

import java.sql.Timestamp;

public class BoardVO {
	private int idx;
	private String tit;
	private String content;
	private String writer;
	private Timestamp regdate;
	private int cnt;
	
	
	public BoardVO() {
		super();
	}

	public BoardVO(int idx, String tit, String content, String writer, Timestamp regdate, int cnt) {
		this.idx = idx;
		this.tit = tit;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
		this.cnt = cnt;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getTit() {
		return tit;
	}

	public void setTit(String tit) {
		this.tit = tit;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "BoardVO [idx=" + idx + ", tit=" + tit + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + ", cnt=" + cnt + "]";
	}
	
	
}
