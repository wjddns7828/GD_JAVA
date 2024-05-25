package com.min.edu;
//TODO 001String과 newString() 비교
public class StringCompare {
	
	//String은 선안만으로도 객체가 됨
	//String은 new를 해도 객체가 된다
	// 하지만 같은 값을 가지고 있다면 같은객체라고 생각 할 수 있다.
	public static void main(String[] args) {
		
		//String의 객체를 만들어 내는데 , 선언 /대입/new방법을 통해서 작성했다.
		String str1 = "Smile";
		String str2 = str1;
		String str3 = "Smile";
		String str4 = new String("Smile");
		
		//문자열 연산 : Concatenation(연쇄)
		// 문자는 더하기 (+)연산을 통해서 문자열이 합쳐진다
		String str5 = "Sm"+"ile"; //리터럴 연산
		
		
		String tmp1 = "Sm";
		String tmp2 = "ile";
		String str6 = tmp1+tmp2;//Concatenation
		
		System.out.println("str1 선언 == str5리터럴 연산 :"+(str1==str5));
		System.out.println("str1 선언 == str6 Concatenation 연산 :"+(str1==str6));
		
		//str4는 str1의 ref값을 가지고 있음
		System.out.println("str1 선언 == str4 new 생성"+(str1==str4));
		
		//str2가 같은 값을 가지고 있을때는 같은 레퍼런스를 가진 객체를 따라가지만 str1의 값이 바뀌면
		//str2는 그대로 str1 은 바뀐 값의 객체를 생성한다
		System.out.println("str1 선언 == str2 대입"+(str1==str2));
		System.out.println("str1 선언 == str3 선언"+(str1==str3));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());
		System.out.println(str6.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6));
		
		
	}
}
