package com.min.edu.main;

import com.min.edu.H20Impl;
import com.min.edu.ctrl.ChoiceFactory;
import com.min.edu.sub.Ice;
import com.min.edu.sub.Steam;
import com.min.edu.sub.Water;

public class H20_Main {
	public static void main(String[] args) {
		System.out.println(ChoiceFactory.factoryCount);
		ChoiceFactory c1 = ChoiceFactory.getInstance();
		ChoiceFactory c2 = ChoiceFactory.getInstance();
		System.out.println("주소가 같니?"+(c1==c2));
		System.out.println("진짜 heap에 같은 객체이니?"+(c1.equals(c2)));
		
			for (int i = 1; i < 4; i++) {
				H20Impl h1 = ChoiceFactory.getInstance().factory(i);
				h1.makeA(); //VMI :interface 추상화 메소드 -> h20Impl abstract 추상화 메소드 -> Ice 구현
				h1.print();
				
//			부모는 공통으로 extends 되지만
//			1)기능 method area에 공통으로 단 1회
//			2) 특징은 각 생성된 Heap 영역에 새로 만들어짐 (instance를 하게 되면 새로운 resuorce가 생성됨)
			}	
//			Ice i = new Ice();
//			i.num =10;
//			Water w = new Water();
//			w.num=10;
//			Steam s = new Steam();
//			s.num =10;
//			System.out.println("생성된 ChiceFactory 갯수 :"+ ChoiceFactory.factoryCount);
	}
}
			
			//1인
//			ChoiceFactory cf1 = new ChoiceFactory();
//			H20Impl h1 = cf1.factory(1);
//			h1.makeA();
//			h1.print();
			//2인
//			ChoiceFactory cf2 = new ChoiceFactory();
//			H20Impl h2 = cf2.factory(2);
//			h2.makeA();
//			h2.print();
			//3인
//			ChoiceFactory cf3 = new ChoiceFactory();
//			H20Impl h3 = cf3.factory(3);
//			h3.makeA();
//			h3.print();
//			


