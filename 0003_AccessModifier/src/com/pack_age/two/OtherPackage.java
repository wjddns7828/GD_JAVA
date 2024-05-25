package com.pack_age.two;

import com.pack_age.one.TestAccessClass;

//TODO 007 외부 + 다른패키지에서 객체를 생성하여 호출
public class OtherPackage {
	/**
	 * TODO TEST003외부의 다른 패키지에서 객체를 생성하여 
	 * 	사용할 수 있는 접근제한자를 확인
	 */
	public void other() {
		TestAccessClass tac = new TestAccessClass();
		tac.publicMethod();
		//protected는 extends 하지않고 New로 사용한다면 
		//Default와 같이 외부 패키지에서는 사용 불가하다
	}
}
