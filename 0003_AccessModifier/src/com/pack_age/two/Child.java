package com.pack_age.two;

import com.pack_age.one.TestAccessClass;

public class Child extends TestAccessClass {
	/**
	 * TODO 004 extends를 통해서 protected는 자식 클래스에서 패키지가 달라도 사용이 가능한 맴버이다
	 */
	public void checkExtends() {
		protectedMethod();
		publicMethod();
	}
}
