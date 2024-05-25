package com.min.edu;
/*
 * 람다식 실행 블럭에서는 클래스인 맴버 필드와 맴버 메소드를 제약없이 사용가능
 * 람다식 실행 블럭 내에서는 this는 람다식을 실행하는 객체를 참조
 */
public class LamdaExam1_inner {
	
	public int memberFiled = 10; // 인스턴스 변수(클래스 변
	
	class inner{
		int innerFiled = 20; //내부클래스에 인스턴스 변수
		
		void method() {
			IMyfunction f = () -> {
				System.out.println("맴버 필드"+memberFiled);
				System.out.println("맴버 필드"+LamdaExam1_inner.this.memberFiled);
				System.out.println("이너 필드"+innerFiled);
				System.out.println("이너 필드"+this.innerFiled);
			};
			f.method();
		}
	}
	
}
