package com.min.edu;

public abstract class ParentImpl implements Iparent {

	@Override
	public abstract void make();
	
	
	@Override
	public void print() {
		System.out.println("Abstract클래스에서 구현 했습니다.");

	}

}
