package com.myway.tok.model;

public class TokTok {
	private String title;

	public TokTok(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	@Override
	public String toString() {
		return "TokTok [title=" + title + "]";
	}
	
	
	
}
