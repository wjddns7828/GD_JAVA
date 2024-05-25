package com.min.edu;

public class Exception_Step7 {
	public int calculation(int num) throws UserDefineException {
		int n = 0;
		if (num<0 || num>10) {
			throw new UserDefineException("우와");
		}
		return num;
	}
}
