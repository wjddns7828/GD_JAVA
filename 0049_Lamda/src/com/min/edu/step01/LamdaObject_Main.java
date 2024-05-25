package com.min.edu.step01;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class LamdaObject_Main {
	public static void main(String[] args) {
		//람다 표현식을 이용하여 인터페이스의 기능을 정의
		ILamda_Object s = (x,y) ->x+y;
		System.out.println(s.combine(2, 3));
		
		ILamda_Object n = new ILamda_Object() {
			@Override
			public int combine(int a, int b) {

				return a+b;
			}
		};
		
		System.out.println(n.combine(2, 3));
		
		//공통 기능의 인터페이스 java.util.function
		BinaryOperator<Integer> add = (x,y)->(x+y);
		int sum = add.apply(3, 3);
		System.out.println(sum);
		
		UnaryOperator<Double> doubler = x-> x*2.0;
		double pow = doubler.apply(100.0);
		System.out.println(pow);
	}
}
