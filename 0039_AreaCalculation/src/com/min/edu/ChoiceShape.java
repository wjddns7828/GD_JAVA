package com.min.edu;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 기능을 분리하여 부모의 타입으로 자신의 객체를 반환하는<br>
 * factory design pattern
 * @author GDJ67
 *
 */
public final class ChoiceShape {
	public static AreaImpl choice() {
		AreaImpl obj = null;

		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("선택해주세요 : 1. 삼각형 / 2. 사각형 / 3. 원형");
				int c = scan.nextInt();
				switch (c) {
					case 1: obj = new Triangle(10, 10); break;
					case 2: obj = new Square(10, 10);break;
					case 3: obj = new Circle(10, 10);break;
				}
				break;
			} catch (InputMismatchException e) {
				System.err.println("잘못된 타입으로 객체를 생성하셨습니다."+e.toString());
			}
		}		
		return obj ;
	}
}
