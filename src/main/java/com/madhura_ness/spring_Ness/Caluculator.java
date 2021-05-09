package com.madhura_ness.spring_Ness;

public class Caluculator {
private int num1;
private int num2;


public Caluculator(int num1, int num2) {
	this.num1 = num1;
	this.num2 = num2;
	System.out.println("constructor -int,int");
}

public Caluculator(double num1, double num2) {
	this.num1 = (int)num1;
	this.num2 = (int)num2;
	System.out.println("constructor -double,double");
}

public Caluculator(String num1,String num2) {
	this.num1 =Integer.parseInt(num1);
	this.num2 = Integer.parseInt(num2);
	System.out.println("constructor -string,String");
}


public void add()
{
	System.out.println("num1: "+this.num1);
	System.out.println("num2: "+this.num2);
	System.out.println("sum: "+(num1+num2));
}
}
