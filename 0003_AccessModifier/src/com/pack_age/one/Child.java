package com.pack_age.one;

public class Child extends TestAccessClass {
/**
 * TODO 004 extends를 통해서 부모의 기능을 확장하여 사용한다
 * protected는 자식클래스가 사용할 수 있음으로 표시된다
 */
	public Child() { // <= 주소 주는 친구
		defaultMethod();
		protectedMethod();
		publicMethod();

	}
}
