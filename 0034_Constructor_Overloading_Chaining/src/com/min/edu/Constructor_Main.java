package com.min.edu;

public class Constructor_Main {
	public static void main(String[] args) {
		//생성자 오버로딩을 하게 되면
		//명시적으로 default 생성자를 선언하지 않으면
		//default 생성자는 사라진다.
		
		//c1과 c2,c3는 생성자를 호출 한 것이다.
		//c1과 c2,c3는 생성자를 부모를 생성하기 위한 super()를 각각 가지고있다.
		ChildClass c1 = new ChildClass();
		ChildClass c2 = new ChildClass(10);
		ChildClass c3 = new ChildClass(10,20);
		
		ParentClass pp = new ParentClass();
		
	}
}
