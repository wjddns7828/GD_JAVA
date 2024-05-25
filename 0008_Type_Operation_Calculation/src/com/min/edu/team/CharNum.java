package com.min.edu.team;

public class CharNum {
	public void change() {
		char a = ('\u216C'); // 숫자 50 8556
		int a_con = Character.getNumericValue(a); // a => 바꾸면 숫자 50이 나옴
		System.out.println(a_con);
	}
}
