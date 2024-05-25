package com.min.edu.instance;

public class InstanceOf_Operation_Main {
	/**
	 * 안전 예방책 instanceOf 연산자를 사용하여 객체의 특정 클래스로 캐스팅 할 수 있는지 
	 * 	여부를 Runtime중에 테스트 함 
	 * 
	 * 이 연산자는 예외를 이르키지 않고
	 * 	왼쪽 객체를 오른쪽 유형(타입)으로 캐스팅 할 수 있는 경우
	 * 	true를 반환 함
	 */
	public static void main(String[] args) {
		Apple a= new Apple(); //자식 이름 생성
		Fruit f = a;//자식의 타입을 부모의 타입으로 변경
		
		//a 는 extends 된 부모(fruit)에 속(변경)할 수 있음
		//f는 원래 생성된 타입인 Apple로만 타입 변경이 가능함 아닌경우 => ClassCastException발생
		
		//*중요* : 객체의 형 변환은 타입의 Arguments가 부모의 타입으로 넘어오기 떄문에
		//		CassCastExceptiond이 발생할 확률이 높다
		//		확인 방법: instanceOf 예약어
		//		처리 방법: try~catch의 Exception으로 처리하는 방법 2가지가 있다.
		
		if(f instanceof Apple) {//f의 객체가 Apple 타입으로 변경이 가능한가요?
			Apple myApple = (Apple)f;
			System.out.println("f 객체는 사과가 될 수 있다."+myApple);
		}
			try {
				Apple myApple = (Apple)f;
				System.out.println("f 객체는 사과가 될 수 있다."+myApple);
			} catch (ClassCastException e) {
				System.out.println("F는 사과가 될 수 없습니다."+e.toString());
			}	
		if(f instanceof Apple myApple) {
			System.out.println("f 객체는 사과가 될 수 있다."+myApple);
		}
		
		if(!(f instanceof Vegetable)) {
			System.out.println("f는 채소는 될 수 없습니다.");
		}
	}
}
