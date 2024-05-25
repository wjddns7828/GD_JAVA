package com.min.edu;
/**
 * TODO 002완전수
 * 진약수의 합이 자신의 숫자가 되는것
 *  6-> 1+2+3 =6
 */
public class PerfectNum {
	//1) 두개의 정수를 입력받아 진약수를 판단하는 메소드
	private boolean NumChk(int num, int chkNum) {
		boolean isc = false;
				if (num%chkNum==0) {
					isc = true;
				} 
		return isc;
	}
	//2) 1)을 사용하여 true(약수로 판단이 될 경우) 인 경우 그 값을 누적하는 메소드
	private int NumSum(int num) {
		int sum = 0;
			for(int i = 1; i<num; i++) {
				if(NumChk(num,i)) {
				sum += i;
			}	
		}
			return sum;
	}
	
	//3) N까지의 범위를 가지면서 2)를 사용하여 비교한 후에 같다라면 완전수를 출력해주는 메소드
	public void perfectNum(int area) {
		
		for (int i = 4; i <= area; i++) { // int i=4; i<=100 i ++
			if(i == NumSum(i)) { //i == sum
				System.out.printf("%d 완전수로 판단됨\n",i);
			}
		}
	}
}
