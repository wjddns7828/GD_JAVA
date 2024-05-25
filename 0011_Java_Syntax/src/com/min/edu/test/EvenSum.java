package com.min.edu.test;

import com.min.edu.For_Fn;

//1~10 중에 짝수만 더하기
public class EvenSum {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 0; i<10; i++) {
			if((i+1)%2==0) {
					sum =sum+(i+1);
				}
		}System.out.println(sum);
		For_Fn fn = new For_Fn();
		fn.make_three();
	}
}
