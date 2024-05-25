package com.min.edu;

import java.util.Arrays;
import java.util.Iterator;

public class StringMethod {
	//public char charAt(int index)
	//문자열은 문자형이 조합되어있는 형태이기때문에 index번호로 해당 문자열의 문자형값을 가져올 수 있다.
	//index번호는 0부터 시작
	//이슈 사항 :만약idex의 길이보다 크게 입력한다면?

	public void fn_charAt() {
		String str = "Dream come true";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i)+"."+i+"/"+(int)str.charAt(i));
		}
	}//fn_charAt

	public void exam_CharA() {
		//문제 1: 아래와 같이 선언 한 이유
		//답 : concatenation을 발생시키기 위해서 사용
		//문제 2: ""가 값일까요? 아닐까요?
		//답 : 값이 아님
		String str = "";
		String str2 = null;
		System.out.println(str + "d");
		//		char c = str.charAt(0);
	}//exam

	//	public int compareTo(String anotherString)
	//	public int compareToIgnoreCase(String str)

	public void Fn_CompareToXXXXX() {
		String name1 = "sns";
		String name2 = "sNs";
		int 코드포인트차이n과m = name1.compareTo(name2);
		System.out.println(코드포인트차이n과m);

		int c = name1.compareToIgnoreCase(name2); //대소문자 무시
		System.out.println(c);
	}

	public void CompareTo_UserDefined(){
		String name1 = "2j2";
		String name2 = "2J2";

		System.out.println((int)'2' + ".2");
		System.out.println((int)'j' + ".j");
		System.out.println((int)'J' + ".J");

		int result = 0;
		for (int i = 0; i < name1.length(); i++) {
			if(name1.charAt(i)!= name2.charAt(i)) {
				result = name1.charAt(i)-name2.charAt(i);
				break;
			}
		}
		System.out.println("결과 :  "+result);
	} //compare

	//public String concat(String str)
	//문자열을 조합ㅎ주는 메소드
	public void fn_concat() {
		String s= "★";
		String result = s.concat("Dream").concat("come").concat("True").concat(s);
		System.out.println(result);
	}
	public void arrays_toString_User_Defined() {
		String[] str = {"사과","바나나","토마토"};
		System.out.println(Arrays.toString(str));
		String result1= "[";
		for (int i = 0; i < str.length-1; i++) {
			result1 += String.format("%s, ", str[i]);
		}
		result1 +=str[str.length-1]+"]";

		System.out.println(result1);
	}

	//public boolean contains(CharSequence s)
	public void fn_contains() {
		String fruit = "청사과,바나나,오렌지";
		boolean isc1 = fruit.contains("사과");
		boolean isc2 = fruit.contains("청사과");
		System.out.println("사과 검색 : "+isc1);
		System.out.println("청사과 검색 : "+isc2);
	}

	//public boolean equals(Object anObject)
	//public boolean equalsIgnoreCase(String anotherString)
	//String과 같이 hashcode가 객체 값으로 override 되어있는 객체만 사용이 가능함
	public void fn_EqualsXXX() {
		String str1 = "jjj";
		String str2 = "JJJ";

		boolean isc1 = str1.equals(str2);//그냥 비교
		boolean isc2 = str1.equalsIgnoreCase(str2); // 대소문자, hashcode 오버라이드 비교

		System.out.println("equals :"+isc1);
		System.out.println("equalsIgnoreCase : "+isc2);

		String txt ="가";
		byte[] texByte = txt.getBytes();
		System.out.println(Arrays.toString(texByte));

	}
	//public int hashCode()
	//hashcode 는 부모 (object)가 생성해주는 고유값임 하지만 String은 가지고 있는 값(unicode) 에 의해서 새로운 Hashcode를 만든다)
	public void fn_hashcode() {
		String str = "가";
		String strnew = new String("가");
		System.out.println(str.hashCode()); //자식이 오버라이드 한 hashcode
		System.out.println(strnew.hashCode()); //자식이 오버라이드 한 hashcode
		
		System.out.println(str.intern().hashCode()); //사용되는 문자열의 StringPool 영역의 값 hashcode
		System.out.println(strnew.intern().hashCode());//사용되는 문자열의 StringPool 영역의 값 hashcode
		
		System.out.println(System.identityHashCode(str));//sp에 생성 되어질 때 override전의 Hashcode
		System.out.println(System.identityHashCode(strnew));//heap에 생성 되어 sp의 값을 연결하기 전의 Hashcode
	}//hashcode
	
	
	//public int indexOf(String str)
	//public int lastIndexOf(String str)
	public void fn_XXXindexOf() {
		String strs = "ko coco ko";
		System.out.println(strs.length()); //index = 9 / length 10
		
		//ko의 위치 찾기
		int startSearch = strs.indexOf("ko");
		int startSearchFrom = strs.indexOf("ko",3); //
		int endSearch = strs.lastIndexOf("ko");
		int endSearchFrom = strs.lastIndexOf("ko",3);
		System.out.println(startSearch);
		System.out.println(startSearchFrom);
		System.out.println(endSearch);
		System.out.println(endSearchFrom);
	}
	
	//trim()
	//앞 뒤 공백을 제거함 WhiteSpcae(Unicode 32)
	public void fn_trim() {
		String str = "                            ho   ho   　                    ";
		System.out.println(str.length());
		String strTrim = str.trim();
		System.out.println(strTrim.length());
		System.out.println(strTrim);
	}
	
	//strip()
	//public String strip()
	public void fn_strip() {
		String str = "                            ho   ho   　                    ";
		String strStrip = str.strip();
		System.out.println(strStrip);
		System.out.println(strStrip.length());
		
		for (int i = 0; i < 101; i++) {
			System.out.println((char)i+":" + i);
		}
	}
	//toCharArray()
	public void fn_toCharArray() {
		
		char[] strChar = {'T','O','M','A','T','O'};
		String str = new String(strChar);
		System.out.println(str);
		char[] strConvert = str.toCharArray();
		System.out.println(strConvert.length);
		System.out.println(Arrays.toString(strConvert));
	}
	
	//valueOf()
	public void fn_ValuOf() {
		//모든 타입(기본, 참조)을 보이는 그대로 문자열로 변경해줌
		//print(),toString()
		TextClass t = new TextClass();
		String info = t.toString();
		System.out.println(info);//com.min.edu.TextClass@77459877
		System.out.println(t);//com.min.edu.TextClass@77459877
		
		int i = 100;
		char a = 'a';
		String result = "" + i+a;
		String result2 = String.valueOf(i)+a;
		
		String iStr = String.valueOf(i);
		String h = "100";
		System.out.println(iStr.hashCode());
		System.out.println(h.hashCode());
		System.out.println(System.identityHashCode(iStr));
		System.out.println(System.identityHashCode(h));
		System.out.println(iStr==h);
		System.out.println(iStr.equals(h));
	}
	//endsWith()
	public void fn_endsWith() {
		String str = "exam@naver.com";
		System.out.println(str.endsWith("naver.com"));
		System.out.println(str.endsWith("google.com"));
	}
	//matches(String regex)**
	//replace(char oldChar, char newChar)
	//replaceAll(String regex, String replacement)**







}
