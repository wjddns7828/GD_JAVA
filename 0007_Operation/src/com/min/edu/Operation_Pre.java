package com.min.edu;

//연산자 우선순위
public class Operation_Pre {
	//연산자 중 최우선 == 괄호()
	// 1. ++ -- ! ~
	// 2. * /  %
	// 3. + -
	// ~~마지막 = 
	public void operation() {
		boolean isc1 = 2+3 > 1 *4 && 5/5 == 1;
		boolean isc2 = (2+3) > (1 *4) && (5/5 == 1);
		System.out.println(isc1);
		System.out.println(isc2);
	}
	
}
