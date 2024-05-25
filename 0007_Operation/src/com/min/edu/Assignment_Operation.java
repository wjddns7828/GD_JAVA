package com.min.edu;

public class Assignment_Operation {
	public void assigment(){
		//일반적인 대입연산
		int i = 0;
		
		//단축 연산
		// 변수에 대해서 연산을 수행 한 다음 결과를 동일한 변수에 다시 저장 할 떄 
//		int a = 3+1; // 오칙연산
		i=+5; // 똑같음 i = i+5;
		// i+=5; => i = (+5); 연산이 처리 됨
		
		System.out.println(i);
	}
	//증감 연산자
	//선처리 후 증가 후처리 선 증가
	public void in_decrement() {
			//변수를 1번씩 증가 ++
			//변수를 1번씩 증가 --
		
		//변수 뒤에 ++ : 선처리 후증가
		//변수 앞 ++ : 후처리 선 증가
		int y = 100;
		
		System.out.println(++y); //101
		System.out.println(--y); //100
		System.out.println(++y); //101
		System.out.println(--y); //100
		System.out.println(y++); //100 -> 101
		System.out.println(y++); //101 ->102
		System.out.println(y--); //102 -> 101
		System.out.println(y); //101
		
//		int m, n, x, z=10; // z만 10임 이유는 z만 대입이여서
		
		int m,n;
		m=5; //5
		n=m++; // n을5에 넣고 +1 처리
		System.out.println(m+"/"+n); //처리를 해서 m=6 / n=5
		m=5;
		n= ++m;
		System.out.println(m+"/"+n);
	}
}
