package com.min.edu;

//TODO 001 약수의 합을 구하는 클래스
// 진약수: 0과 자신의 숫자를 제외하고 나누어 떨어지는 수


//두개의 숫자를 입력받아 약수인지 확인하는 메소드

public class Yaksu {
	//	public int div(int a, int x) {
	//		int c = a;
	//		for (int i = x; i <= c; i++) {
	//			if(c%i==0) { //a의 진양수 구하기 a를 i로 나누고 나머지가 0인 값을
	//				System.out.println(i);
	//			}	
	//		}
	//		return a;
	//	}

	/**
	 * 두개의 숫자를 입력받아 약수인지 확인하는 메소드
	 * @param num = 약수를 구할 수
	 * @param chkNum =약수인지 판단되어 지는 값
	 * @return 약수 == True | !약수 == false
	 */
	public boolean siCheck(int num, int chkNum) {
		return (num%chkNum ==0)? true:false; //3항 연산자로 확인하기

		//		boolean isc = false;
		//		if (num%chkNum==0) {
		//			isc = true;
		//		}
		//		return isc;
	}	//ischk

	//약수 확인 메소드에 의해서 약수라 판단이 되면 누적하는 메소드
//	public void sum (int num, int chkNum) { //num == 약수를 구할수 / chkNum == 판단
//		int sum = 0; //더하는값
//		if(num%chkNum==0) {
//			for (int i = 1; i < num; i++) {
//				if(num%i==0) {
//					sum = sum+i;
//							}
//				}
//				System.out.println(sum);
//		}else {
//			System.out.println("약수 아님");
//		}
//	}
	
	public void yaksu_Sum(int num) {
		int sum=0;
		for (int i = 1; i<num; i++) {
			if(siCheck(num,i)) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
