package com.min.edu;

/**
 * Heap에 객체가 단 1회만 생성되도록 만들어진 Class
 * 
 *
 */
public class SingleObject {
	private static SingleObject single;
	private SingleObject() {
		
	}
	
	public static SingleObject getinstance() {
		if(single == null) {
			single = new SingleObject();
		}
		
		return single;
	}
	
}
