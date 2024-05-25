package com.min.edu.info;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UserListCheck_Main {
	//TODO 003 hashcode를 orverride 하여 String과 같은 역활의 객체를 우리도 만들어보자 
	//1) 기본 User_VO 객체를 출력 해보자. => 패키지.클래스명@Hashcode 16진수
	public static void main(String[] args) {
		User_VO user01 = new User_VO("코코아", 12, "서울시");
		
		System.out.println(user01);
		User_VO user02 = new User_VO("바나나", 12, "서울시");
		User_VO user03 = new User_VO("토마토", 12, "서울시");
		
		UserList lists=new UserList();
		lists.addUser(user01);
		lists.addUser(user02);
		lists.addUser(user03);
		User_VO[] user_list = lists.getLists();
		System.out.println(Arrays.toString(user_list));
		
		User_VO user04 = new User_VO("바나나", 12, "서울시");
		Boolean chk = lists.listCheck(user04);
		System.out.println(chk?"같은 값이 있음":"입력가능");
	}
}
