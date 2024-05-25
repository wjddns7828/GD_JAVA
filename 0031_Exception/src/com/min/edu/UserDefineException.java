package com.min.edu;
//특징을 물려받음
public class UserDefineException extends Exception{
	private static final long serialVersionUID = -6637943465894812692L;
	
	//생성자 오버로딩
	public UserDefineException() {
//		super(); // -> Exception
		this("사용자 예외처리");
	}

	public UserDefineException(String message) {
		super(message);// -> Exception(String)
	}


	
	
	
}
