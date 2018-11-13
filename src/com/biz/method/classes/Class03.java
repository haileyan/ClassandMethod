package com.biz.method.classes;

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ScoreVO라는 클래스를 사용해서 
		//		scoreVO라는 객체 인스턴스를 선언하라.
		//			 	  객체를 초기화 하라.
		ScoreVO scoreVO = new ScoreVO();
		//				      첫글자가 대문자인 method
		//					  생성자라고 부른다.(Constructor)
		//					  클래스를 이용해 선언된 객체를 
		//					  초기화 하는 용도로 쓴다.
		ScoreVO scoreVO01 = new ScoreVO();
	
		
		// 객체는 선언만 된 상태에서는 쓰기/읽기 다 안된다.
		// 참고로 일반 변수는 선언이 되면 쓰기는 된다. 읽기만 안됨.
		ScoreVO sVO = new ScoreVO();
		sVO = new ScoreVO();
		sVO.strName = "홍길동";
		sVO.strName = "이몽룡";
		
		sVO = new ScoreVO();
		// System = 클래스
		System.out.println(sVO.intKor); //sVO의 값 모두 초기화 됨.
		
		
		
	}

}
