package com.min.edu;

public class Clone_Main {
	
	//ProtoType Design Pattern
	public static void main(String[] args){
		UserInfoVo vo1 = new UserInfoVo("임정운", "강서구", 26);
		System.out.println(vo1);
//		UserInfoVo vodeep = (UserInfoVo) vo1.clone();
//		System.out.println(vodeep);
		
		UserInfoVo voClone = (UserInfoVo)vo1.createClone();
		System.out.println(voClone);
		
		System.out.println("원본 : " + vo1.hashCode());
		System.out.println("복제 : " + voClone.hashCode());
	}
}
