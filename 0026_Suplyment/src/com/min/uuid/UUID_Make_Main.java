package com.min.uuid;

import java.util.UUID;

public class UUID_Make_Main {
	public static void main(String[] args) {
		//random숫자코드를 만드는 객체
		//중복 되지않는 이름을 만들어 낼 때 사용함
		UUID a = UUID.randomUUID();
		System.out.println(a.toString());
		System.out.println(a);
	}
}
