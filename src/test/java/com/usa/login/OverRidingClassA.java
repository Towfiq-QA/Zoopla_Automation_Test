package com.usa.login;

public class OverRidingClassA {

	public void getFatherProperty1() {
		System.out.println("BMW");
	}
	
	public void getFatherProperty2() {
		System.out.println("House with pool");
	}
	
	public void getFatherProperty3() {
		System.out.println($400000);
	}
	
	public void myChild() {
		System.out.println("XYZ");
	}
	
	public static void main(String[] args) {
		OverRidingClassA obj = new OverRidingClassA ();
		obj.getFatherProperty1();
		obj.getFatherProperty2();
		obj.getFatherProperty3();
		obj.myChild();
	}
}
