package com.biz.method.classes;

public class ScoreDAO {

	ScoreVO scoreVO;
	
	// 생성자 method
	public ScoreDAO() {
		this.scoreVO = new ScoreVO();
		
	}

	public int makeSum() {
		int intSum = scoreVO.intKor; // intKor의 선언 없이도 바로 사용가능
		intSum += scoreVO.intEng;
		intSum += scoreVO.intMath;
		intSum += scoreVO.intSci;
		intSum += scoreVO.intHis;
		return intSum;
	}
}
