package com.min.edu;

public class Object_Main {

	public static void main(String[] args) {
		//객체의 생성(instance)
		//같은 맴버필드를 가지고 있지만 다른 객체이다. => new를 하면 heap에 새로운 hashcode와 ref가 생성되기 때문이다
		// u1/u2에는 ref가 있다
		// 기본타입 (pbValue , immutalble) 참조타입 (pvrefrence, mutalble)
		UserDefineClass u1 = new UserDefineClass();
		UserDefineClass u2 = new UserDefineClass();
		com.min.edu.gd67.UserDefineClass u3 = new com.min.edu.gd67.UserDefineClass();
		Class<? extends UserDefineClass> urlU1 = u1.getClass();
		
		
		
		
		//1) getClass를 통해서 생성된 객체의 설계도(class)의 위치를 확인 하자!!!!!!!!!!!!!!!!!!
		System.out.println(u1.getClass());
		System.out.println(u2.getClass());
		System.out.println(u3.getClass());
		
		//2) Hashcode를 통한 고유값 확인
		
		System.out.println("u1의 Hashcode : "+u1.hashCode());
		System.out.println(System.identityHashCode(u1));
		System.out.println("u2의 Hashcode : "+u2.hashCode());
		System.out.println("u3의 Hashcode : "+u3.hashCode());
		
		//3) toString() 객체의 위치와@고유값 을 출력 해줌
		//System.out.print기능의 출력 함수는 보여주는 것 / 객체는 위치를 출력해준다
		//system.out.println()은 toString()을 호출해준다. 기본 타입은 stack의 값을 출력해준다
		System.out.println(u1);
		String present = u1.toString();//부모 클래스에서 자식클래스를 표출해줌
		System.out.println(present);
		
		System.out.println("==========");
		System.out.print(u1.getClass().getName());
		System.out.print("@");
		System.out.println(Integer.toHexString(u1.hashCode()));
		
		//4) equals() 부모객체를 통해서 자식의 클래스의 같음 비교하는것
		//객체 의 비교는 equals()
		//객체의 비교는 생성한 object 클래스를 통해서
		// 	1) 같은 곳에서 생성 되었는지 package.Class명
		//	2) 같은 객체 인지 down casting이 되는지 //참조타입의 형 변환 부모의 타입으로 변경되는건 Up-casting / 자식의 타입으로 변경되는건 down-casting
		//	3) 같은 값을 내부에 가지고 있는지
		//	전제 조건 같은 타입 이여야 한다.
		
		UserDefineClass ud01 = new UserDefineClass();
		UserDefineClass ud02 = new UserDefineClass();
		
		String ud01_one = ud01.getClass().getName();
		String ud02_one = ud01.getClass().getName();
		
		System.out.println(ud01_one==ud02_one); // 같은 package 와 클래스에서 생성 된 객체다
		
		Object ud01_two = ud01; //up-casting
		Object ud02_two = ud02; //up-casting
		UserDefineClass ud01_two_c = (UserDefineClass)ud01_two;//true
		UserDefineClass ud02_two_c = (UserDefineClass)ud02_two;//true
		
		try {
			com.min.edu.gd67.UserDefineClass ud01_two_tt = (com.min.edu.gd67.UserDefineClass)ud01_two;
		} catch (Exception e) {
			System.out.println("아님");
		}
		
		System.out.println("객체 내부의 값을 getter를 통해 stack으로 ");
		boolean isc = (ud01.getName().equals(ud02.getName()))? true:false;
		System.out.println(isc);
		
	}
}
