package com.min.edu;

//grave표현식과 유사
/**
 * 텍스트블록 java13에서 미리보기 기능을 도움 15부터 표준
 * 
 * 텍스트 블록은 세개의 따음표를 사용 """ xxx """
 * 여러줄을 구분하여 출력하거나 문자열로 만들기는 어려움
 * 따라서 텍스트 블록을 통해서 문자열을 간소하된 방식으로 (줄바꿈) 만들 수 있다.
 * 
 * javascript를 통해서 Html을 구성하는 Rest화면을 만들 때 사용됨 =>SPA >> Single Page Application
 */
public class TextBlock {
	public static void main(String[] args) {
		//기존의 줄 바꿈 방식은 반드시 Escape문자를 사용했어야 했음
		String str1 = "안녕하세요" + "반갑습니다"+"수요일입니다.";
		String str2 = "안녕하세요\n" + "반갑습니다\n"+"수요일입니다.";
		String str3 = """
				안녕하세요
				여러분
				흑기사위성입니다.
				""";
		System.out.println(str1);
		System.out.println("===");
		System.out.println(str2);
		System.out.println("===");
		
		System.out.println(str3);
	}
}
