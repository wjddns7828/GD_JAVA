package com.min.edu;
/**
 * 자바에서 타입은 
 * 기본타입(primitive) 프로그램에서 기본 제공되어 스택에서 사용 됨
 * 참조 타입(reference) 클래스로 되어있고 Heap에 생성되어 주소와 hashcode를 가지고 있음
 * java.lang => 자동으로 값이 기본타입 <-> 참조타입 변경이 된다 AutoBoxing AutoUnBoxing
 * java.lang.String : 문자열은 문자형이 조합되어 있는 형태 참조타입
 * array = 특성도 없고 기능도 없음 오직 같은 타입의 변수를 저장하기 위한거임 
 * array는 주소도 없음 없는 이유는 클래스가 없어서 생성자도 없음 그럼 주소도 없음
 *
 */
public class Array_Declaration {
	//TODO 001 Array 선언 방법
	
	public static void main(String[] args) {
		int[] x; //선언 1
		
		//TODO 001_1 첫번째 선언 방법
		//new를 통해 객체를 생성하면서 값을 입력하는것
		int[] arr1 = new int [] {1,2,3}; //
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		//TODO 001_2 두번째 선언 방법 
		//값을 입력하여 객체를 입력받음
		int[] arr2 = {1,2,3};
		
		//TODO 001_3 세번째 선언 방법
		//객체의 공간만을 생성하는데, 생성타입의 기본값으로 초기값이 생성됨
		int[] arr3 = new int[3];
		System.out.println(arr3[0]);
		
		//TODO 002 입력과 출력 
		//Array는 변수 객체 변수의 값은 객체를 찾아가는 주소가 들어있음
		//[int index]를 사용하여 해당 인덱스의 값을 출력 혹은 입력
		arr3[1] = 100;
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		
		System.out.println(arr3.length );//index.length << 길이 index=0부터 / 길이는 1부터
		
//		arr3[3] = 100; 런타임 오류남
		
		System.out.println(arr3[4]);
	}

	
}
