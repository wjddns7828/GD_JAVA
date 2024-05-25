package com.min.edu;

import java.util.Arrays;

public class Arguments_Test {
	public static void main(String[] args) {
		ValueChange vc = new ValueChange();
		int num = 100;
		int[] nums = new int[2];
		System.out.println("기본타입 값 원본 : "+  num);
		vc.changePrimitive(num);
		System.out.println("메소드 실행 후 기본타입 값" + num);
		
		System.out.println("참조타입 값 원본: " +Arrays.toString(nums));
		vc.changeReference(nums);
		System.out.println("메소드 실행 후 참조타입 값: " +Arrays.toString(nums));
	}
}
