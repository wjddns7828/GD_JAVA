package com.min.edu;
/**
 * TODO 001 Skip Return 문법
 * 1) 반환 타입이 있다면 반드시 Return 예약어를 사용해서 값을 반환해줘야함
 * 2) Return문은 끝 블록에 도달하기 전에 종료 하기 위해서 반환 타입을 void로 만들고 Return이라는 예약어를 작성해줌
 *
 */
public class SkipReturn {
	//문자열을 받음 arguments의 값이 비어("")있다면  출력을 하지않고 메소드를 종료
	public void flagPrint(String msg) {
		//기존 방식
		if (msg=="") {
			return;
		}
		System.out.println("전달 받은 메시지 :" + msg);
	}
}
