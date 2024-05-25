package com.min.edu;

public class Final_Main {

	public Final_Main() {
	}

	public static void main(String[] args) {
		//자식을 생성해서 부모의 타입
		FinalClass f =  new ChildClass();//UpCasting //부모의 타입으로 만들면 부모만 보임
		System.out.println(f.callMethod());
		
		//부모를 생성해서 부모의 타입
		FinalClass fo = new FinalClass();
		System.out.println(fo.callMethod());
		
		//자식을 생성해서 자식의 타입
		ChildClass cc = new ChildClass();
		System.out.println(cc.callMethod());
	}

}
