package com.min.edu;

public class Child extends Parent{
	public int n = 300;

	@Override
	public void parentMake() {
		System.out.println("난 오버라이드 했다");
	}
	
	public void callParent() {
		System.out.println("extends된 자식만이 부모의 Overriding된 맴버를 호출 할 수 있음");
		super.parentMake();//외부에서는 절대 오버라이딩된 부모의 멤버를 호출 할 수 없다.
	}
	
	
}
