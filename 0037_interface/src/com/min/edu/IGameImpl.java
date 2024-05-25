package com.min.edu;

public class IGameImpl implements IGame {

	@Override
	public void print_Conf() {
		System.out.println("일반 클래스가 구현했다 print_Conf");

	}

	@Override
	public String makeA() {
		System.out.println("일반 클래스가 구현했다 makeA");
		return null;
	}

	@Override
	public String makeB() {
		System.out.println("일반 클래스가 구현했다 makeA");
		return null;
	}

}
