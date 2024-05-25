package com.min.edu;

import com.min.edu.IGame.HelperClass;

public class Interface_Main {

	public static void main(String[] args) {
		System.out.println(IGame.AGE);
		System.out.println(IGame.VAL);
		System.out.println(IGame_Conf.VAL);
		System.out.println();
		
		//D로 표기되는 메소드는 interface에 있는 공통 메소드이다.
		IGameImpl g = new IGameImpl();
		g.print("aa");
		
		IGame ig = g;
		IGame_Conf ic = g;
		IGame_Bin ib = g;
		System.out.println(ig.makeA());
//		System.out.println(ic.VAL);
		ib.print_Conf();
		
		//기존에는 new를 통한 객체를 생성하여 객체명.메소드() 로 호출도 가능하고 static호출 방법인 클래스명.메소드도 가능했다
		// 이 방식은 혼란을 가져오기 때문에
		// 인터페이스의 static메소드는 interface명.메소드()로만 호출이 가능하도록 된다
		System.out.println(IGame.sum(11));

		g.printString();
		HelperClass hc = new HelperClass(); 
		hc.helperMethod();
		
	}

}
