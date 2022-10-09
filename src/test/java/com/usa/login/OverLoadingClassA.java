package com.usa.login;

public class OverLoadingClassA {

	public void studentInfo(int id) {
System.out.println(id);

	}
	public void studentInfo (double phonenum) {
		System.out.println(phonenum);
	}
	
	public void studentInfo (String job, int salary) {
		System.out.println(job+salary);
	}
	
	public static void main(String[] args) {
		OverLoadingClassA obj = new OverLoadingClassA();
		obj.studentInfo(123456);
		obj.studentInfo(0.098);
		obj.studentInfo(QA,100000);
	}
}
