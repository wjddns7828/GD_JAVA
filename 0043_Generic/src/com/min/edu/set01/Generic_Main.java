package com.min.edu.set01;

public class Generic_Main {
	public static void main(String[] args) {
		//TODO 002 MyBox 사용
		//기존 객체는 한개의 타입을 입력 받고 담을 수 있음
		//하지만 Generic 으로 생성 된 객체는 사용시 타입의 작성을 통해서 선언되기 떄문에 제한이 없음.
		
		MyBox<String> box1 = new MyBox<String>();
		box1.boxl = "박스다";
		MyBox<Integer> box2 = new MyBox<Integer>();
		box2.boxl = 3;
		System.out.printf("%s / %d ",box1.boxl, box2.boxl);
		
		
		//TODO 003 Java7부터는 비어있는 타입의 선언이 가능
		
		MyBox<Integer> iBox = new MyBox<>();// 빈 타입
		
		iBox.boxl =5;
		Integer i = iBox.boxl;
		System.out.println(i);
		
//		iBox.box = "안농"; compile 에러
//		String s= iBox.boxl; compile 에러
		
		
	}
}
