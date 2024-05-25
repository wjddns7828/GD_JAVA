package com.min.edu;

//논리 연산
// && short circuit
public class Logical_Operation {
	
	public void logical() {
		boolean isc1 = true &false; // false
		boolean isc2 = true | false; //true
		boolean isc3 = !(true); //false
	}
	
	// && ||
	// & : 선행연산과 후행연산을 모두 확인
	// &&: 선행의 연산 결과에 따라 후행의 연산 여부를 정해준다
	// ex) true && 라면 후행의 결과에 따라서 최종 결과가 정해진다 => 후행연산 진행
	// ex) false && 라면 후행이 최종 결과에 영향이 없기 떄문에 후행 연산을 하지않음.

	public void shortcircuit() {
		
		//1) 선행이 true라면 후행이 실행되는 시나리오 증명
		boolean isc1 =trueValue() && falseValue(); 
		
			
		
		//2) 선행이 false라면 후행이 실행되지않는 시나리오 증명
		boolean isc2 =falseValue() && trueValue();
		
	}
	public boolean trueValue() {
		System.out.println("true 실행");
		return true;
	}
	public boolean falseValue() {
		System.out.println("false실행");
		return false;
	}
}
