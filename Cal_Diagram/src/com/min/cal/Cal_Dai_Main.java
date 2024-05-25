package com.min.cal;

public class Cal_Dai_Main {

	public static void main(String[] args) {
		Cal_Dai_Method CDM = new Cal_Dai_Method();
		//int a = CDM.getDayOfMonth(2023, 1); //이거는 그 달의 일수를 체그하는 것
		//System.out.println(a);
		
//		int a = CDM.calDaysbeforYear(2);//X의 전 년도 12월까지의 합을 구함
//		System.out.println(a);
		
//		int a = CDM.calDaysBeforYMonth(1, 2);
//		System.out.println(a);
		
//		int a = CDM.calDaysBeforYMDate(2024, 4, 1);
//		System.out.println(a);
//		for (int i = 1; i <= 12; i++) {
		
			CDM.print_Calendar(2023,1);
			
			System.out.println("\n\n");
//		}
		
	}

}
