package com.min.edu;

public class If {

	public static void main(String[] args) {
		int sum = 0;
		int j=0;
		int cnt = 0; //반복횟수
		for (int i = 3; i<=9; i++) { //반복횟수 / 0~9==>10회
			if(i%3==0) {
				sum+=i;
				System.out.printf("3의 배수%d\n",sum);
				sum-=i;
			}
			else if(i%4==0) {
				j +=i;
				System.out.printf("4의배수 %d\n",j);
				j -=i;
			}else {
				cnt += i;
				System.out.printf("나머지 : %d\n",cnt);
				cnt -= i;
			}

		}
	}
}
