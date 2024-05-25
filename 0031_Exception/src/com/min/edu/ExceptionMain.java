package com.min.edu;

import java.io.FileNotFoundException;

public class ExceptionMain {

	public static void main(String[] args) {
//		Exception_Step01 step01 = new Exception_Step01();
//		System.out.println(step01.calculation());
		
		
//		Exception_Step2 step2 = new Exception_Step2();
//		System.out.println(step2.calculation());
		
		
//		Exception_Step3 step3 = new Exception_Step3();
//		System.out.println(step3.calculation());
		
//		Exception_Step4 step4 = new Exception_Step4();
//		System.out.println(step4.calculation());
//		Exception_Step5 step5 = new Exception_Step5();
//		System.out.println(step5.calculation());
		
//		Exception_Step6 step6 = new Exception_Step6();
//		try {
//			System.out.println(step6.calculation());
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Exception_Step7 step7 = new Exception_Step7();
//		try {
//			System.out.println(step7.calculation(20));
//		} catch (UserDefineException e) {
//			e.printStackTrace();
//		}
//		System.out.println("예외처리");
		
//		Exception_Step8 step8 = new Exception_Step8();
//		try {
//			step8.makeException();
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Exception_NotUsed not = new Exception_NotUsed();
		try {
			System.out.println(not.calculation());
		} catch (UserDefineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
