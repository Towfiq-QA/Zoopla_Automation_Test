package com.usa.login;

public class EncapsulationClassA {

	private String job = "QA";
	private int salary = 8000;
	public String getJob () {
		retun job;
		
	}
	public int getSalary () {
		retun salary;
		
	}
	
	public static void main (Strng[]args) {
		EncapsulationClassA obj = new EncapsulationClassA();
		System.out.println(obj.getJob());
		System.out.println(obj.getSalary());
	}
}
