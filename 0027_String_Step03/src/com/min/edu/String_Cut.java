package com.min.edu;

import java.lang.reflect.GenericArrayType;
import java.util.Arrays;
import java.util.StringTokenizer;

public class String_Cut {
	
	public void fn_substr() {
		//성과 이름을 나눌 때 유용함 
		//substring(index n) : n 부터 끝까지 잘라냄
		//substring(index n, index m) : n부터 잘라내는데 m-1까지 잘라냄
		String str = "Happy New Year";
		int idx = str.indexOf("New");
		String newYear = str.substring(idx);
		System.out.println(newYear);
		int idxy = str.indexOf("Y");
		System.out.println(idxy);
		String ne = str.substring(idx, idxy-1);
		System.out.println(ne);
		
		String chk1 = "";
		String chk2 = null;
		//chk1이 값인가요? 네 맞습니다 하지만 String에서만 허용되는 객체. concatenation에 사용하는 초기값
		//              아니요 왜냐하면 문자열은 문자형이 조합되어 있어야 함, 문자열을 자르면 1개의 유니코드 값이여야함 
		//					chk1.charAt(0); 으로 자르면 예외가 발생 ArrayIndexBounsException ==>인덱스가 없다
		System.out.println(chk1.hashCode());
		System.out.println(System.identityHashCode(chk1));
		//null이란? Stack에 변수는 존재하지만 Heap영역에는 객체가 없는 상태
		//			NullPointException
		
//		String test = chk2.intern();
//		System.out.println(chk2.hashCode());
//		System.out.println(System.identityHashCode(chk2));
	}
	public void fn_split() { //이메일 나눌 때 좋음
		String str = "oop:and:foo";
		String txt = "oop.and.foo";
		String[] strArr = str.split(""); // 정규 표현식에서 ""는 하나의 요소 (Unicode)
		String[] txtArr = txt.split("[.]"); //.단어라고 하는 정규식 문법이기 때문에 특수 문자로 인식 escape문자하거나 정규식 범위[]값으로 사용된다.
		System.out.println(Arrays.toString(strArr));
		System.out.println(Arrays.toString(txtArr));
		
		//Split은 정규식을 기반으로 기준으로 잡고 그 기준이 되는 값은 사라지고
		//만약 잘라진 Array의 끝 값이 ""라면 해당 배열은 값으로 존재하지않는다.
		String[] strArrO = str.split("o"); //[][][p:and:foo][][]
		System.out.println(strArrO.length);
		for (String s : strArrO) {
			System.out.println(s);//[][][p:and:foo]
		}
	}
	//java.util.StringTokenizer -> Enumeration으로 바뀜 
	//Iterator Design pattern : 가지고있는 객체를 모두 확인 후 출력하는 pattern
	//split과의 차이 점 : 갯수를 예측 그래서 반환타입이 StringArray
	//StringTokenizer : 값을 예측을 못함 -> Iterator pattern을 통해서 출력
	
	public void fn_StringTokenizer() {
		String str = "abc/ def/ ghi";
		//token의 값이 없을경우 \t\r\f의 값을 기준으로 자름
		StringTokenizer st = new StringTokenizer(str);
		
		//
		while (st.hasMoreTokens()) {//String Tokenizer //객체에 객체가 있는지
			String n = st.nextToken();
			System.out.println(n);
		}
		
		//Iterator Pattern
		while (st.hasMoreElements()) {
			String n = (String) st.nextElement();
			System.out.println(n);
		}
		//split과 다르게 값이 아닌것은 객체로 만들지 않는다.
		String str1 = "oop:and:foo";
		StringTokenizer st1 = new StringTokenizer(str1, "o");
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		System.out.println("--------------------");
		String str2 = "\u3000 \u3000.and.f";
		String ss = "\u3000";
		System.out.println(ss);
		
		StringTokenizer st2 = new StringTokenizer(str2,"\u3000");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
	}
}
