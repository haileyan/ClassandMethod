package com.biz.method.classes.oop01;

import com.biz.method.classes.dao.DogDAO;

public class DogExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogDAO dogDAO = new DogDAO();
		dogDAO.dogVO.setStrName("몽탱이");
		
		dogDAO.dogRun();
		dogDAO.goEat();
		
		dogDAO.dogRun("운동장");
		dogDAO.goEat("치즈");
		
	}

}
