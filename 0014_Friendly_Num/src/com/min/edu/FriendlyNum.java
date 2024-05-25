package com.min.edu;
/**
 * TODO 003 친화수
 * 220 -> 진약수의 합 = 284
 * 284 -> 진약수의 합 = 220
 * 
 *
 *
 *1) 약수 여부를 판단하는 메소드
 *2) 진약수의 합을 반환하는 메소드
 *3) 친화수를 판단하는 메소드
 */
public class FriendlyNum { //약수 여부 판단 (true == 약수)
	public boolean yakSu(int num, int numchk) {
		boolean isc = false;
		if (num%numchk==0) {
			isc = true;
		}
		return isc;
	}

	public int yaksuSum(int num) { 
		int sum = 0; //약수 더하기
		for(int i = 1; i<num; i++) {
			if(yakSu(num,i)) {
				sum = sum+i;
			}
		}
		return sum;
	}

		public void yaksuRange(int area) { //범위 지정
			for(int i = 2; i <= area; i++) { //1부터 X까지 돌리는것
				int a = i; //i의 완전수 구하기
				int b = yaksuSum(a);
				int c = yaksuSum(b);
				if (a<b&& a!=b && a==c) {
					System.out.printf("%d와 %d는 친화수 입니다",a,b);
				}
			}
		}
//	public void firendlyProcess(int area) {
//		for(int i = 2; i <= area; i++) {
//			for (int j = 2; j <= area; j++) {
//				if(i==yaksuSum(j) && j==yaksuSum(i)) {
//					System.out.printf("%d와 %d는 친화수 입니다\n",i,j);
//				}			
//			}
//		}
//	}
}