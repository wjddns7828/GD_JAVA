package com.min.edu.scope;

//TODO 008 변수의 사용 범위
public class VariableScope {

	//-------------맴버필드 영역------------
	
	int age; 
	public boolean isc; 
	public String name; 
	private int cnt = 0;
	public static int num; // 클래스명.변수로 불러옴
	
	//-----------------------------------
	  public int bring() {//private 가져오기
	  
	 return (cnt); }
	 
	 public void cal() { 
		 int a; int cnt = 10; 
		 System.out.println(cnt); //<<로컬 변수사용 (로컬 변수 최우선)
		 System.out.println(this.cnt);//<<맴버필드 영역에 있는걸 호출할려면 this 사용 }
	 }
	  

	
	//-------------맴버메소드영역------------
	
	
	
	//-----------------------------------
}
