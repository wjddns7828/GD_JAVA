package com.min.edu.bmi;
/**
 * bmi 계산하는 메소드가 있는 클래스
 * @author GDJ67
 *
 */
public class BmiClass {
	//메소드명 : bmi_calculation
	//반환 타입 : 실수
	//입력 값 : 정수(몸무게), 실수(키) Ex) 70, 1.7
	//연산 식 : BMI = 몸무게 /(키 * 키)
	
	public double bmi_calculation(int weight, double tall) {
		double bmi = 0.0;
		bmi = weight/(tall*tall);
		return (bmi);
	}
}
