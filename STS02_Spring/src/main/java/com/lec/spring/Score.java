package com.lec.spring;

public class Score {
	int kor;
	int eng;
	int math;
	String comment;
	
	
	public Score() {
		super();
	}
	public Score(int kor, int eng, int math, String comment) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.comment = comment;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Score [kor=" + kor + ", eng=" + eng + ", math=" + math + ", comment=" + comment + "]";
	}
	
	
	
	
}
