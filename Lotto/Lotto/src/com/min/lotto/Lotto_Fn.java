package com.min.lotto;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;

public class Lotto_Fn {
	Calendar cal = Calendar.getInstance();
	Scanner scan = new Scanner(System.in);


	//입력 받은 금액에서 반환 할 로또의 갯수
	public int LottoCnt(int money) {
		int lottoCnt  = money/1000;
		return lottoCnt;
	}
	//잔돈
	public int lottoChange(int money) {
		int lottoChange = money%1000;
		return lottoChange;
	}
	//오늘 요일 가져오기
	public String y(String []a) {
		int x = cal.get(Calendar.DAY_OF_WEEK);
		String b = a[x-1];
		return b;
	}
	// 그 주 토요일과의 날짜 차이 구하기 
	public int sat() {
		//Day_Of_Week == 일 월 화 수 목 금 토
		int today = cal.get(Calendar.DAY_OF_WEEK);
		while (true) {
			if(today==7) {
				return today;
			}else {
				today++;
			}
		}
	}
	public int[][] userInput(int[][]lottoData){
		int i = 0;
		int j = 0;
		System.out.printf("번호를 입력해주시고 제출을 원하시면 \"제출\" 을 입력해 주세요\n");
		while(true) {
			System.out.printf("%d장의 %d번째 번호",i+1,j+1);
			String b = scan.nextLine();
			if(b.equals("제출")) {
				break;
			}else if(b.equals("다음")){
				j=0;
				i++;
			}else {
				int num =Integer.parseInt(b);
				if(false==isValueInArray(lottoData, num)) {
					System.out.println("값이 있음");
					lottoData[i][j] = 99;
					}
				else if(true==isValueInArray(lottoData, num)) {
					System.out.println("값을 넣어줌");
					lottoData[i][j]=num; 
					j++;
				}
				if(j==6) {
					j=0;
					i++;
				}
			}
		}
		return lottoData;
	}


	//중복되는 값 찾아서 바꿔주기
	public boolean isValueInArray(int[][] arr, int value) {
		for (int[] row : arr) {
			for (int num : row) {
				if (num == value) {
					return true;
				}
			}
		}
		return false;
	}




}





















