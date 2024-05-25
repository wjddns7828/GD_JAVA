package com.min.edu;

import com.min.edu.hierarchy.ChildClass_A;
import com.min.edu.hierarchy.ChildClass_B;
import com.min.edu.hierarchy.ParentClass;

//TODO 003 객체의 형변환

//용어 
// up-casting : 자식 클래스의 타입에서 부모 타입으로 변경되는 것
// down-casting : 부모의 타입에서 자식의 구체화된 타입으로 변경 되는 것
public class Object_Exchange {
	public static void main(String[] args) {
		ChildClass_A a = new ChildClass_A();
		ChildClass_B b = new ChildClass_B();
		a.parentMethod();
		a.make_A();
		b.parentMethod();
		b.make_B();
		
		//자식의 타입을 부모의 타입으로 변경
		//up casting
		ParentClass pa = a;
		pa.parentMethod();
		
		ParentClass pb = b;
		pb.parentMethod();
		
		Object obj = pa;
		
		//pa는 childclaas_A로 구현되어있엇고 
		//pb는 childclass_B로 구현되어있엇음
		
		//down casting
		//부모가 생성되어진 원래의 자식 타입으로 구체화 되는것
		ChildClass_A aa=(ChildClass_A)pa;
		ChildClass_B ao=(ChildClass_B)pa;
		
	}
}
