package com.min.edu;

public class ObjectVO {
	public static int newObjectCnt=0;
	public ObjectVO() {
		newObjectCnt ++;
	}
	/**
	 * 객체가 사라 질 때 한번 호출 되는 메소드 
	 */
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("안녕히가세요"+this.hashCode());
		newObjectCnt--;
		super.finalize();
	}
}
