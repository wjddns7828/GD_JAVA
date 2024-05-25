package com.min.edu;

//child의 부모 클래스가 되게 만들것
// 생성자를 오버라이드 할꺼임
//메소드를 생성할꺼임 =>자식이 오버라이드 할 수 있게 할꺼임
//?? 오버로딩을 같은 클래스가 아니라 부모가 가지고 있는 메소드명으로 생성 
public class Parent {
	public int num;
	
	//default 생성자, 클래스 명과 같고 반환 타입이 없으며 외부에서 인스턴스를 만들기 위해 단 1회 호출되는 메소드

	public Parent() {//TODO 05
//		print(); //자신의 맴버를 호출하기 위해서 부모가 만들어져 메모리에 올라가야(생성) 함 =>super()
		super(); //TODO 06최상위 부모인 Object의 생성자
		this.print();//TODO 07
		System.out.println("부모의 생성자");//TODO 08
	}
	public void setNum(int num) {
		this.num = num;
	}
	//멤버 메소드
	public void print() {
		System.out.println("부모의 print 메소드");
	}
	
	public int getNum() { //메소드는 오버라이드가 됨
		return num;
	}
	
	
	
}//c
