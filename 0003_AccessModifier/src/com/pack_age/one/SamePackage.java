package com.pack_age.one;

//TODO 006 외부에서 객체를 생성 한 후에 접근 제한자를 확인 한다. 
public class SamePackage {
	/**
	 * TODO Test002 같은 패키지에서 TestAccessClass를 New해서
	 * 하위에 있는 멤버 매소드를 호출해 본다.
	 */
	public void samePackageAccess() {
		
		// 타입 / 객채명 / 대입연산자 new예약어 / TestAcessClass의 생성자
		TestAccessClass tc =new TestAccessClass();
		tc.publicMethod();
		tc.defaultMethod();
		tc.protectedMethod();
		//private로 선언된 맴버는 객체로 생성해도 호출되지않는다
	}
	
}