package com.min.edu.div;
/**
 * TODO 002 진약수와 완전수를 구하는 메소드
 * 진약수란? 특정 수의 약수 중 자기 자신을 제외 한 값
 * 완전수란? 진약수의 합
 * 
 */
public class Div {
	/**
	 * 
	 * @param a : 완전수를 구할 값
	 * @param i : 카운트도 하고 진약수도 구하는 값
	 * @return sum<<완전수
	 */
	public int cnt(int a) {
			int sum = 0;
		for (int i = 1; i < a; i++) {
			if(a%i==0) { //a의 진양수 구하기 a를 i로 나누고 나머지가 0인 값을
				sum = sum+i; //if문이 True 일 경우 i는 a의 진약수 이기 때문에 sum에 더해줌으로써 완전수를 구해준다.
			}	
		}
		System.out.println(a+"의 진양수 : "+sum);
		return sum; //완전수를 return해줌
	}
}
