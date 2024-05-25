package com.min.edu;
// TODO 003 커피숍의 커피를 주문하는 메인 클래스
public class Perform {
	/**
	 * 커피 Application에 시작과 끝
	 * @param args
	 */
	public static void main(String[] args) {
		Coffe_Bill client = new Coffe_Bill(); // new = 객체에 주소를 주는것
		client.coffe ="아아";
		client.cup = 23;
		
		Coffe_Shop coffe = new Coffe_Shop();
		String result = coffe.orderstaff(client);
		System.out.println(result);
	}
}
