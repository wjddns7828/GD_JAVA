package com.min.edu;

public class Exception_Step8 {
	//throw와 throws를 통해서 예외처리 메시지를 전달하여 원하는 메시지를 처리 할 수 있다
	//throws가 된 메소드는 사용 할 때 반드시 호출 할 곳에 예외처리를 해줘야한다
	
	public void makeException() throws Throwable {
		throw new Exception("예외처리 글자를 바꿔봅시다");
	}
}
