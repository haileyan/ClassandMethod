package com.biz.method.classes;

public class Class04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strName = "홍길동";
		
		
		System.out.println(strName);
		
		String strNation = new String();
		strNation = "대한민국";
		int l = strNation.length(); // strNation("대한민국")의 길이 값을 변수 l에 저장하라.
		System.out.println(l);
		
		int intNum = 1;
		float f = (float)intNum;  	// C언어 방식 ~ 오류발생 가능성 내포
		
		Integer intNum1 = 45;
		System.out.println(intNum1.floatValue()); 	// JAVA 방식, 확장된 기능 사용
		// intNum1.
		
		Float floatNum1 = new Float(0f);
		
		
	}

}
