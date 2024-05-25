package com.min.edu;
//TODO 003 클래스의 구조 와 실행 순서
public class StructureClass {

	//클래스의 구조 

	//!) 맴버필드 : 접근 제한자가 있고 메소드 밖에서 작성되어 있는 변수, 선언만 한다면 자동으로 default값으로 초기화
	private int age;
	public static String name;
	//@) 생성자 (constructor) : 클래스명과 같고 반환타입이 없고 객체를 단 1회 호출한다
	public StructureClass() {
		System.out.println("Constructor");
	}
	//$) 맴버 메소드 : 클래스의 기능을 정의하는곳
	public void make(int a) { //int: argument / a = parameter
		for (int i = 0; i < a; i++) { // i = local variable
		}
	}
	//%) 연산 블럭 
	{
		System.out.println("Initialization Block");
	}
	//&) static생성자 : static을 초기화 하거다 값을 입력 할 때 사용
	static {
		System.out.println("static Block");
	}

}
