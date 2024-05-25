package com.min.edu;
/**
 * 
 * Class의 final을 작성한다면 상속 금지가 됨<-> 상속 강요 (abstract / interface)
 *
 */
public /* final */ class FinalClass {

	//맴버 필드는 외부에서 new를 했을 때 혹은 static이 메모리에 올라 갈 때 
	//선언만 되어졌다면 자동으로 타입의 초기값이 대입됨
	//하지만 final로 되어있다면 재입력으로 되기 인식되기 떄문에 사용 할 수 없음
	//하지만 static은 static생성자가 우선 순위와 같은 시점을 갖기 떄문에 static생성자를 통해 단 1회 입력가능
	public static final int[] ARR;
	static {
		ARR = new int [3];
	}
	
	public static final int AGE = 26;
	
	public void change() {
//		ARR = new int [4]; 참조타입은 주소가 고정되기 떄문에 새로운 주소를 입력 할 수 없다
		ARR[0] = 100; //참조타입은 주소가 고정되는 것이지 객체 내부의 값이 고정되는것은 아니다.
		
		final int a;// localVariable(지역변수)는 선언만 하고 사용하지 않으면 오류가 발생함, 선언만 하면 사용되지않는 변수 의미 없음
					//lovalVariable(지역변수)는 선언 후 입력이 가능 왜냐하면 생성 시점과 입력 시점이 같기 떄문에.
		a = 0;
//		a = 20;
		System.out.println(a);
	}

	public static int[] getArr() {
		return ARR.clone();
	}
	
	public /* final */ String callMethod() {
		return "나는 부모메소드";
	}
}
