package com.min.edu;

//게임의 구현해야 할 주 기능을 선언 interface
//TODO 001 같은 타입의 interface는 extends를 통해서 여러개 확장이 가능하다
public interface IGame extends IGame_Conf, IGame_Bin{
	

	int AGE=100;
	public String makeA() ;
	String makeB() ;
//	private int NUM=100; Implements는 강제로 자식 클래스의 구현체, private, protected는 접근제한자는 사용하지 못한다
//	protected String addr = "";	
	
	//java 8
	//인터페이스에서 기본 메소드를 정의하는 기능이 추가되었다(공통 메소드)
	//이러한 메소드는 기본 키워드(default)를 사용하여 지정되어 인터페이스 내부에서 구현을 포함 할 수 있다.
	//구현 클래스에 의해서 재정의 되지 않는 한 기본 메소드가 사용됩니다.
	//사용하는 이유 :default메소드는 interface를 사용 할 때 기존의 클래스를 손상시키지 않고 인터페이스에 메소드를 추가하기 위해서
	
	default void print(String a) {
		System.out.println("인터페이스 메소드"+a);
	}
	
	//java8
	//static(정적) 인터페이스(static(정적) 메소드)
	//일반 클래스의 static 메소드와 유사하게 작동하고 interface에 속하여 context(context-인터페이스 이름)을 
	// 통해서만 사용(호출) 할 수있다.
	static int sum (int n) {
		return n +10;
	}
	
	//연산의 기능은 복잡도가 높은 경우 메소드로 분리하여 코드를 장석
	//자바 9에서 
	// static 메소드를 위한 연산을 비공개로 private로 처리해주는 분리코드를 작성 할 수 있다.
	// 코드의 중복 제거 할 수 있다.
	private static String getString() {
		return "String";
	}
	
	default void printString() {
		System.out.println(getString());
	}
	//숨기는 클래스를 작성 할 수 있다.
	//innerClass를 생성 할 수 있다.
	class HelperClass{
		public void helperMethod() {
			System.out.println("인터페이스에 선언한 이너 클래스");
		}
	}
}
