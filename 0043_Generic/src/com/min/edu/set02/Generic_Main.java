package com.min.edu.set02;

public class Generic_Main {
	// TODO 006 제네릭 메소드와 생성자를 사용
	public static void main(String[] args) {
		MyGenericClass mg = new MyGenericClass(10);
		System.out.println(mg.getS());//문자열의 값을 출력해준다
		
		Boolean[] arrB = {true,false,false,true};
		MyGenericClass.printArray(arrB);
		
		MyGenericClass.<Boolean>printArray(arrB);
	}

}
