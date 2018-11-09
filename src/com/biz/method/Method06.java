package com.biz.method;

public class Method06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1 = 100;
		addVar();
		addVar(intNum1);
		System.out.println(intNum1);
		
		System.out.println(intNum1 * 20);
		System.out.println(intNum1);
		
	}
	public static void addVar() {
		int intNum1 = 200;
	}
	
	public static void addVar(int intNum1) {
		intNum1 = 300;
	}
}
