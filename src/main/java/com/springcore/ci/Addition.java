package com.springcore.ci;

public class Addition {

	private int a;
	private int b;
	
	//making constructor(as per the order it will start executing first constructor )
	
	//constructor 1
	public Addition(int a,int b) {
		
		this.a=a;
		this.b=b;
		
		System.out.println("constructor : int,int");
	}
	//constructor 2
	public Addition(double a,double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("constructor : double, double");
	}
	//in cofig file we have mentioned the value string so it calling string constructor first or else we can mentin type and indedx in cofig.xml file
	public Addition(String a,String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("constructor : String, string");
	}
	
	public void doSum() {
		System.out.println("Value of a " + this.a);
		System.out.println("Value of a " + this.b);
		System.out.println("Sum is"+(this.a + this.b));
	}
	
}
