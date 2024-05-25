package com.pack_age.one;
	//TODO 001 모든 접근제어자를 가지고 있는 테스트 클래스
public class TestAccessClass {
	
	//TODO TEST0001 같은 클래스의 메소드에서 접근제한자 확인하기
	private void test001() {
		publicMethod();
		protectedMethod();
		privateMethod();
		defaultMethod();
	}
	
	//TODO 002 public Method
	public void publicMethod() {
		System.out.println("나는 퍼블릭");
	}
	//TODO 003 default Method
	void defaultMethod() {
		System.out.println("나는 디폴트");
	}
	//TODO 004 protected Method
	protected void protectedMethod() {
		System.out.println("나는 프로텍트");
	}
	//TODO 005 private Method
	private void privateMethod() {
		System.out.println("나는 프라잇");
	}
}
