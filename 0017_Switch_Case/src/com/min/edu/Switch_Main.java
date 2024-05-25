package com.min.edu;

public class Switch_Main {

	public static void main(String[] args) {
		//1) Switch~Case문은 선택 조건문이라고 함
		// if문과 다르게 선택된 1개의 값만 실행된다.
		// 비교 대상이 정수이다
		//fall-through: break를 안쓰면 다음 값이 다 실행됨
		int x = 2;
		switch (x) {
		case 1:
			System.out.println("난1이다"); /* break; */
		case 2:
			System.out.println("난2이다"); /* break; */

		default:
			System.out.println("난 몰라");
			/* break; */
		}//1번 스위치

		// project자바 버전 바꾸기
		//2)java 7 1.7.0.5 버전부터 문자열 영역이 heap에 포함되면서
		// switch case문의 비교 값으로 사용이 가능
		String str = "맑음";
		switch (str) {
		case "맑음":
			System.out.println("맑은 하늘이 좋다.");
			break;
		default:
			System.out.println("날씨가 추웠네요");
			break;
		}//2번째 스위치

		//java 14버전부터는 case에 값이 아닌 표현식(값으로 평가되는 코드 비교=)가 사용가능
		String result;
		switch (x) {
		case 1:	
			result =  "하나";
			break;

		case 2:
			result =  "둘";
			break;

		case 3:	
			result =  "셋";
			break;
		default:
			result = "많이";
		} // 세번째 스위치

		//4) 화살표 레이블을 폴스로우를 허용하지 않으므로 break 키워드가 사용되지않음
		// ->는 public String ???(){
		// return "one"
		//}
		String result2;
		switch(x) {
		case 1 -> result2 = "one";
		case 2 -> result2 ="two";
		case 3 -> result2 = "three";
		default -> result2 = "많이";
		}

		String result3 = switch(x) {
		case 1 -> "one";
		case 2 -> "two";
		case 3 -> "three";
		default ->"많이";
		}; //<< ; 꼭 작성하기
		//4번

		//5번 하나 이상의 표현식이 필요한 경우 전체코드 블럭이 포함 될 수 있습니다.
		// 이러한 블럭에서 yield문은 switch 표현식이 평가 할 값을 지정하는데 사용됩니다.
		
		String result4 = switch(x) {
		case 1 -> "one";
		case 2,3 -> "two or three";
		default -> {
			if(x>4) {
				yield"for";
			}else {
				yield"many";
			}
		}
		};
	}

}
