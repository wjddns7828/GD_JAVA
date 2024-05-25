package com.min.edu;


//
public class ChildClass {
	private int x;
	private int y;
	
	//default 생성자 : 클래스를 생성하면 기본적으로 생성되는 반환이 없는 메소드
	public ChildClass() {
	super();
	}
	//생성자 overloading
	//맴버 필드의 초기 값을 입력하기 위한 argument 두개를 입력 받는 생성자
	public ChildClass(int x, int y) {
		super();//Chaining : 자식이 생성될려면 부모가 먼저 생성되어야 한다. 
		this.x = x;
		this.y = y;
	}
	//생성자 overloading 1개의 argument를 입력 받는 생성자
	public ChildClass(int x) {
		super();
		this.x = x;
		this.y = x;
	}
	
	
}
