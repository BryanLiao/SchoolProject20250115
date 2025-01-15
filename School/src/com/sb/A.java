package com.sb;
/**
 * @version 1.0
 * @author Bryan Liao
 * <br>
 * <h3>學員管理系統</h3>
 * 20250115
 */
import com.sa.Student;
import com.sa.Student2;

public class A extends Student implements Student2 {
	private int chi;

	/**
	 * 
	 * @param name 姓名
	 * @param chi 中文成績
	 */
	public A(String name, int chi) {
		super(name);
		this.chi = chi;
	}

	/**
	 * 
	 * @return 中文成績
	 */
	public int getChi() {
		return chi;
	}

	/**
	 * 
	 * @param chi 中文成績
	 */
	public void setChi(int chi) {
		this.chi = chi;
	}

	/**
	 * 顯示
	 */
	@Override
	public String show() {
		return super.show() + "\t國文:" + chi;
	}

	/**
	 * 顯示技能
	 */
	@Override
	public void skill() {
		System.out.println("A skill");
	}
	
	

}