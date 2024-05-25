package com.min.edu;

public class GeneralClass {
	
	private static int cnt;
	
	
	//TODO 001 클래스를 만들면 자동으로 클래스명과 같은 이름의 반환이 없는 메소드가 만들어짐
	// 보이지 않음 --> Default 생성자
	public GeneralClass() {
		System.out.println("이전의 객체 갯수:"+cnt);
		cnt++;
	}


	public static int getCnt() { //source general getter / setter
		
		return cnt;
	}


	public static void setCnt(int cnt) {
		GeneralClass.cnt = cnt;
	}
	
	
	//TODO 002 메소드이기 떄문에 접근제한자를 private를 하면 외부에서 접근이 안되기 때문에 인스턴스화를 할 수 없다.
//	private GeneralClass() {
//		
//	}
	
}
