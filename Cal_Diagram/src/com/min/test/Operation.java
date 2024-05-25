package com.min.test;

public class Operation {
	
	public void op() {
		int n = 0;
		
		//값이 아니고 값을 반환하는 애도 가능
		boolean isc = (n==0)?a():b() ;
		
		//c()의 반환타입이 달라서
		Object isc2 = (n==0)?a():c() ;
		
		// 리턴은 반드시 반환이 있어야 하기 떄문에 void로 되어 있는 메소드는 호출 할 수 없음
		//문법 적 오류
//		boolean isc3 = (n==0)?a():v();
	}
	public void v() {
		
	}
	public boolean a() {
		return true;
	}
	public boolean b() {
		return false;
	}
	public String c ( ) {
		return "a";
	}
}
