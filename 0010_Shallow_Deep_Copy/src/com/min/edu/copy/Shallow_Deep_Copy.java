package com.min.edu.copy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Shallow_Deep_Copy {
	
	public void shallow() {
		//pass by reference 참조타입의 특징
		// - 값의 복제가 아닌 같은 객체를 사용 할 수 있도록 주소를 전달해준다.
		// 		ㄴ주소를 전달한다는 것의 의미는 같은 객체를 바라보고 있다.
		
		// == 비교 연산자 (equal)
		// 기본타입을 비교하면 값을 비교
		// 참조타입은 비교하면 객체의 주소(reference)를 비교
		
		//기본타입 변수의 특징
		// 한번 값이 입력되면 다시 입력하기 전 까지 기존 값을 유지한다.
		int i1 = 10;
		int i2 = 20;
		System.out.println(i1==i2);
		
		//참조타입
		int[] arr1 = {1,2,3}; // ==> ref , hash 생성
		int[] arr2 = {1,2,3}; // ==> ref , hash 생성
		int[] arrC = arr1; // ==> shallw Copy; ==> 주소를 전달
		
		System.out.println(arr1 == arr2);
		System.out.println(arr1 == arrC); //arr1과 arrC는 주소가 같다 == 같은 객체이다
		
		System.out.println("원본"+Arrays.toString(arr1));
		System.out.println("복사"+Arrays.toString(arrC));
		arrC[2]=100;
		System.out.println("원본"+Arrays.toString(arr1));
		System.out.println("복사"+Arrays.toString(arrC));
	}
	//TODO 002 java Array의 복사 방법
	//Java의 Array는 크기를 늘리거나 줄이는것이 불가능 함
	// 1) Stack을 이용한 방법
	// 2) Heap을 이용한 방법
	// 3) 메모리를 사용하는 방법
	public void deep() {
		String[] strs = {"d","r","e","a","m"};
		// 1) 
		String[] strs_C1 = new String [strs.length]; //length == 5
		for (int i = 0; i < strs_C1.length; i++) {
			strs_C1[i] = strs[i];
		} 
		
		//2) obj를 사용하는 방법
		String[] strs_C2 = strs.clone();
		
		//3) 메모리를 통해서
		System.out.println();
		String[] strs_C3 = new String[5];
		System.arraycopy(strs, 0, strs_C3, 1, 2); //strs 0번째부터 붙혀넣을껀데  Strsc3의 1번째 부터 붙힐꺼다 근데 2번째 까지만
		
		
		strs[0] = "K";
		System.out.println("원본 :" + Arrays.toString(strs));//원본
		System.out.println("Stack :" + Arrays.toString(strs_C1));//스택복사
		System.out.println("Heap :" + Arrays.toString(strs_C2));//힙복사
		System.out.println("메모리 :" + Arrays.toString(strs_C3));//메모리복사
	}
	
}
