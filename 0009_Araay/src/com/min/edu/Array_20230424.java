package com.min.edu;

import java.util.Arrays;

public class Array_20230424 {
	public static void main(String[] args) {
		String[] strs = new String[3]; // String에 아무것도 없을 시 Null값이 들어감
		/**
		 * array => XXX.length
		 * 문자열(String) => XX.length();
		 * JCF(Map, Set, List) => XXX.Size();
		 */
		System.out.println("Array의 길이"+strs.length);
		/**
		 * 길이는 1부터 시작 Index는 0부터 시작
		 * Index의 범위를 벗어난 값(index)을 입력하면 예외를 발생시킴 ArrayIndexOutOfBounsException
		 */
		strs[1] = "월요일";
		for (int i = 0; i < strs.length; i++) { //선처리 후 증가
			System.out.printf("Index : %d / 값: %s\n",i,strs[i]);
		}
		
		Object[] obj = new Object[3];
		obj[0] = 1;
		obj[1] = "1";
		obj[2] = 1.1;
		
		for(Object o : obj) {
			System.out.println(o);
		}

		//n차원 Array 표 안에 표
		// 0,1
		int [][] nArray = {
				{1,2},//0
				{3,4},//1
				{5,6} //2
				};
		int n =  nArray[0][1];
			System.out.println(n);
			
		//Array 존재하지 않는 타입 = 클래스가 없음
		// 클래스는 맴버(맴버필드, 맴버 메소드)
		//java. util.Arrays 라는 클래스
		// 클래스가 없기 때문에 Array를 처리 할 수 있는 기능만을 가지고 있는 클래스
		
		Arrays.fill(strs, "값");//pass by reference
		
		String print =  Arrays.toString(strs);
		System.out.println(print);
			
		strs[1] = "하이"; // strs배열의 2번째 Index에 "하이"를 넣는다
		Arrays.sort(strs); //strs 배열을 오름차정렬 한다
		String print1 =  Arrays.toString(strs); //strs를 출력하기 위한 구문 print1에 strs를 String으로 변환하여 print1에 넣는다
		System.out.println(print1);
	}// Method끝

}
