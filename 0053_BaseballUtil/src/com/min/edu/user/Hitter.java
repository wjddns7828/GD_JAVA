package com.min.edu.user;

import java.util.regex.Pattern;

import com.edu.util.DefineUtil;

public class Hitter extends GamerImpl{

	public Hitter() {
		this(3);
	}

	public Hitter(int n) {
		super(n);
	}

	//사용자가 유효값이 처리된 비교 숫자의 Array생성
	@Override
	public void make() {
		int n = box.length;
		System.arraycopy(makeNum(), 0, box, 0, n);
		while (true) {
			if(checkArray()) {
				System.out.println("중복된 값을 입력하셨습니다.");
				System.arraycopy(makeNum(), 0, box, 0, n);
			}else {
				break;
			}
		}
	}

	private int[] makeNum() {
		int[] tmp = new int[box.length];
		System.out.println("정수 3개를 붙혀서 입력해 주세요");

		String str = DefineUtil.getString();
		System.out.println("입력하신 숫자는!! : "+str);

		//정규화 표현식 중에서 문자 검증 java.util.regex.Pattern matches();
		//숫자만 입력 받겠다.

		//^시작 [1-9]==> 1-9까지 *반복이 될 수 있다는걸 말함 $종료
		String patten = "^[1-9]*$"; 
		//		String testValue = "888";

		//false하면 사용 할 수 없다
		//		boolean regex = Pattern.matches(patten, testValue);
		//		System.out.println("입력한 값이 1~9까지의 숫자입니까?"+regex);
		while (str.equals("")||str.length()!=box.length || !Pattern.matches(patten, str)) {
			System.out.println("다시 입력해 주세요");
			str = DefineUtil.getString();
		}

		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = Character.getNumericValue(str.charAt(i));
		}

		return tmp;
	}


	// 중복 테스트
	private boolean checkArray() {
		//		box = new int[] {1,2,3}; //테스트 했음
		boolean isc = false;
		int n = box.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i!=j && box[i]==box[j]) {
					isc = true;
				}
			}
		}
		return isc;
	}

}
