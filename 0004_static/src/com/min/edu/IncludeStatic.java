package com.min.edu;

public class IncludeStatic {
	
	private static int num=10;
	
	public void make() { //그냥 메소드
		System.out.println("일반 메소드 make");
		//TODO Test001 같은 클래스의 static 맴버를 호출 해 보자
		// 호출된다
		staticPrint();
		System.out.println(Math.PI);
	}
	public void print() {
		System.out.println("일반 메소드 print");
	
	}
	
	public static void staticPrint() { //맴버
		//TODO Test002 static에서 non static을 호출하는 방법
		//호출 불가
		//하지만 new를 통해 메모리에 활당한다면 호출 할 수 있다.
		IncludeStatic is = new IncludeStatic();
		is.make();
		System.out.println("static 메소드 staticPrint");

	}
	
}
