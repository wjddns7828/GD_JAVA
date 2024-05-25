package com.min.edu;

public class Fibonachi_Main {
	public static void main(String[] args) {

			System.out.println("피보나치의 수혈 층 값 : "+fibonachi(5));

		
	}
	
	public static int fibonachi(int num) {
		if(num==1) {
			System.out.println(num);
			return 1;
		}else if(num==2) {
			System.out.println(num);
			return 1;
		}else {
			System.out.println(fibonachi(num-1)+fibonachi(num-2));
			return fibonachi(num-1)+fibonachi(num-2);
		}
	}
	
	public <Integer> i(int a){
		return a;
	}
}
