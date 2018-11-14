package com.biz.method.classes.wrapper;

public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String형(type)은 일반 변수처럼 사용이 되지만
		 * 실제로는 변수가 아니고 class이다.
		 * 다른(c언어)언어에 없는 문자열 데이터를 취급하기 위한 자료형
		 */
		String strName = "홍길동";
		String strNation = new String();
		String strN = " ";
		
		System.out.println(strN);
		System.out.println(strNation);
		
		String strDog = new String("불독");
		// -> String strDog = "불독"과 같다.
		
		strNation = "대한민국";
		strName = "Tom Cruise";
		System.out.println("문자열 길이:" + strNation.length());
		System.out.println(strName.toLowerCase());
		System.out.println(strName.toUpperCase());
		
		if(strName == "Tom Cruise") {
			System.out.println("탐크루즈 맞네!!");
		}
		
		if(strName.toLowerCase() == "tom cruise") {
			System.out.println("탐크루즈 맞네!!");
		}
		
		if (strName.equals("Tom Cruise")) {
			System.out.println("진짜 탐이네!!");
		}
		
		if(strName.toUpperCase().equals("TOM CRUISE")) {
			System.out.println("대문자 TOM");
		}
		
		if(strName.toLowerCase().equals("tom cruise")) {
			
		}
		
		if(strName.equalsIgnoreCase("toM CruISE")) {
			System.out.println("섞어서 TOM");
		}
		
		
		String strA = "A";
		if(strA == "A") {
			System.out.println("대문자 A네!!");
		}
	}

}
