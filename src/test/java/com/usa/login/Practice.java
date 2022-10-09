package com.usa.login;

public class Practice {
static String name = "Towfiq";
int salary = 5000;

void getTest () {
	System.out.println("This is my getTest method");
	
}
String getInfo () {
	
	System.out.println("This is my getInfo method");
	return "How are you?";
	
}

static void getSalary (int salary) {
	System.out.println("My salary is " + "$" + salary );
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "123 JH, NYC";
		
		Practice obj = new Practice (); //obj = object name
		obj.getInfo();
		obj.getTest();
		
		Practice.getSalary(50000);
		
		
	

		
System.out.println("");
	}

}
//void = return nothing [no output]
//return = return something [there is some output]
//parameter = arguments inside the parameter/parenthesis and used for dynamic values