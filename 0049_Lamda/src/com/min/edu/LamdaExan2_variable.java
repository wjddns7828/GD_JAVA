package com.min.edu;

public class LamdaExan2_variable {
	void method(int age) {
		int localVar = 10;
		
//		age=100;//람다 표현식에서 사용 되기 때문에 age는 final 특성을 부여받음
		IMyfunction f = ()->{
			System.out.println("age"+ age);
			System.out.println("localVar"+ localVar);
		};
		f.method();
	}
}
