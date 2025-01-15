package com.sb;

import com.sa.Student;
import com.sa.Student2;

public class B extends Student implements Student2 {
	private int eng;
	
	/**
	 * 
	 * @param name 姓名
	 * @param eng 英文成績
	 */
	public B(String name, int eng) {
		super(name);
		this.eng=eng;
	}

	/**
	 * 回傳英文成績
	 * @return 英文成績
	 */
	public int getEng() {
		return eng;
	}

	/**
	 * 
	 * @param eng 英文成績
	 */
	public void setEng(int eng) {
		this.eng = eng;
	}

	/**
	 * 顯示成績
	 */
	@Override
	public String show() {
		return super.show()+"\t英文:"+eng;
	}

	/**
	 * 顯示技能
	 */
	@Override
	public void skill() {
		System.out.println("B skill");
	}

	
}
