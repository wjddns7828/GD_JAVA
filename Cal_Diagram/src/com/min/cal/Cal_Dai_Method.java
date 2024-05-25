package com.min.cal;

public class Cal_Dai_Method {

	// TODO 001 운년/평년 [X월]의 일 수 정의
	private final int LEAP[] = {31,29,31,30,31,30,31,31,30,31,30,31}; // 윤년
	private final int PLAIN[] = {31,28,31,30,31,30,31,31,30,31,30,31}; // 평년

	// TODO 002 윤년인지 평년인지 확인 해주기
	public boolean isCheckYear(int year){
		boolean isc = false;
		if(year%4==0 && year%100!=0 || year%400==0) {
			isc = true;
		}				
		return isc;
	}

	//TODO 003 X달의 일 수를 체그하는 것
	public int getDayOfMonth(int year,int month) {
		int a=0;
		if (isCheckYear(year)) {
			a=LEAP[month-1];
		} else {
			a=PLAIN[month-1];
		}
		return a; 
	}
	//TODO 004 X년도전 까지의 총 일 수 구하기
	public int calDaysbeforYear(int year) {
		int a = 0;
		for (int i = 1; i <year; i++) {
			if(isCheckYear(year)) {
				a+=366;
			}
			a+= 365;
		}		
		return a;
	}
	//TODO 005 X년도의 Y월  전까지의 총 일수 구하기
	public int calDaysBeforYMonth(int year, int month) {
		int daysum = calDaysbeforYear(year);

		for (int i = 1; i < month; i++) {
			if(isCheckYear(year)) {
				daysum+=LEAP[i-1];
			}else {
				daysum+=PLAIN[i-1];
			}
		}
		return daysum;
	}
	public int calDaysBeforYMDate(int year, int month, int date) {
		int a= calDaysBeforYMonth(year, month);
		a+=date;
		return a;
	}
	public void print_Calendar(int year,int month) {
		System.out.printf("\t\t %d년도 \t%d월\n",year,month); //입력한 년도 / 월
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("=\t=\t=\t=\t=\t=\t=\t");
		int dayOfWeek = (calDaysBeforYMDate(year, month, 1)-1+1)%7; //시작 요일 찾아주기
		int dayofMonth = getDayOfMonth(year, month); //28

//		int beforeDayofMonth = getDayOfMonth(year, month-1);
		
		int beforeDayofMonth = getDayOfMonthCheck(year, month);
		int beforeStart = beforeDayofMonth-dayOfWeek;
		int afterDays = (7-(dayOfWeek+dayofMonth)%7)%7;
		
		for (int i = beforeStart; i < beforeDayofMonth; i++) {	
			System.out.printf("%d\t",i);
		}
		for (int i = 1; i <= dayofMonth; i++) { //몇 월 까지 있을까요?
			System.out.printf("%d\t",i);
			if((dayOfWeek+i)%7==0) {
				System.out.println();
			}
		}//달력의 일 수
		
		for (int i = 1; i <= afterDays; i++) {
			System.out.printf("%d\t",i);
		}
	}//printcal
	
//			for (int i = 0; i < dayOfWeek; i++) { //시작 점 찾아주기 
//				System.out.printf("\t");
//			}//이전 달력의 공백
			
	
		
	/**
	 * 입력받은 월이 1월이라면 index를 벗어남
	 * 따라서 1월이라면 year -1 month12월로 고정
	 * 아니라면 year, month = -1로 값을 변경하여 getdayofMonth(int,int)를 호출하여 값을 리턴해준다
	 * @param year
	 * @param month
	 * @return
	 */
	private int getDayOfMonthCheck(int year, int month) {
		 int resultDate = 0;
		 	if(month==1) {
		 		resultDate = getDayOfMonth(year-1, 12);
		 	}else {
		 		resultDate = 31;
		 	}
		return resultDate;
	}
}
