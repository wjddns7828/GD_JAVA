package com.min.edu;

public class Claender_Main {
	public static void main(String[] args) {
		Calender_Method calM = new Calender_Method();


		//		int yearSum =0;
		//		for(int i = 1;i<=2024; i++) {
		//			if(calM.isCheckYear(i)) {
		//				yearSum++;
		//				System.out.println(i);
		//			}
		//		}

		//		
		//		int year = 2024;
		//		int maxDays = 0;
		//		int summaxDays = 0;
		//		//TODO 2023년까지의 모든 일수를 구해라
		//		int sumtoYearDays = 0;
		//			for (int j = 1; j <= 2023; j++) {//연도 넘기기
		//				
		//				for (int i = 1; i <= 12; i++) {//달의 거시기 구하기
		//					maxDays+=calM.getDayOfMonth(year, i);
		//					System.out.println(maxDays);
		//				}
		//				sumtoYearDays += maxDays;
		//				System.out.println(sumtoYearDays%7);
		//			}
		//TODO 문제1) 2024년 3월 1일의 요일 구하기
		/**
		 * year + month + date
		 * year : 1~2023 => a
		 * A1 = leap년도 * 366 
		 * A2 = plain년도 * 365
		 * a = a1+a2
		 * month : 입력 받은 년도 윤년 O 1~2 => b
		 * date : 1
		 * 
		 * (a+b+1)%=>
		 */
		//		int a1 = 0;
		//		int a2 = 0;
		//		yearSum = 0;
		//		for(int i = 1;i<=2024; i++) {
		//			if(calM.isCheckYear(i)) {
		//				yearSum++;
		//			}
		//		}
		//		a1 = yearSum*366;
		//
		//		for(int i = 1;i<=2024; i++) {
		//			if(calM.isCheckYear(i)) {
		//				
		//			}else{
		//				yearSum++;}
		//		}
		//		a2 = yearSum*365;
		//		int a = a1+a2; //
		//		int b = 0;
		//		b=31+29+1;
		//		int result = (a+b)%7;
		//		System.out.println(result);

		//중요
//		int totalDays = calM.calDays(2024, 3, 1);
//		switch (totalDays%7) {
//		case 0:System.out.println("일");break;  
//		case 1:System.out.println("월");break;  
//		case 2:System.out.println("화");break;  
//		case 3:System.out.println("수");break;  
//		case 4:System.out.println("목");break;  
//		case 5:System.out.println("금");break;  
//		case 6:System.out.println("토");break;  
//
//		}
//		System.out.println("해당 년도의 요일"+totalDays%7);
		
//		calM.print_Cal(2023,4);
		Calendar_API api = new Calendar_API();
		api.print_Cal(2023,4);
		System.out.println("\n\n");
	}
}
