package com.min.edu;

import java.util.Calendar;

/**
 * 대중적으로 사용하는 그레고리안력을 분석하여 메소드로 구성 된 만년 달력을 만들어보자
 *1) 년도/월을 입력하면 해당 년도/월의 달력이 console에 출력 되도록 한다
 *2) 년도를 입력하면 1년 달력이 모드 출력된다.
 *@version 1.0
 */
public class Calendar_API{
	/**
	 * 각월에 최대 일 수는 고정 값으로 되어있음, 따라서 초기값으로 설정
	 * 1,3,5,7,9,11
	 */
	private final int[] LEAP = {31,29,31,30,31,30,31,31,30,31,30,31};
	private final int[] PLAIN = {31,28,31,30,31,30,31,31,30,31,30,31};


	/**
	 * 입력 된 년도의 윤년 여부를 확인하는 메소드
	 * @param 판단하고자 하는 년도
	 * @return 윤년이면 true 평년이면 false
	 */
	public boolean isCheckYear(int year) {
		boolean isc = false;
		if(year%4==0 && year%100!=0 ||year%400==0) {
			isc = true;
		}

		return isc;
	} //윤년 판단
	/**
	 * 입력받은 년도와 월의 최대일수를 반환해주는 메소드
	 * @param year 입력 년도
	 * @param month 입력 월
	 * @return Leap와 Plain의 값
	 */
	public int getDayOfMonth(int year, int month) {
		int days=1;
		if(isCheckYear(year)) {
			days = LEAP[month-1];
		}else {
			days = PLAIN[month-1];
		}
		return days;
	}
	/**입력 받은 년도의 미만까지의 년도를 윤년을 판단하여 
	 * 윤년은 366 / 평년은 365를 더하여 누적값을 반환하는 메소드
	 * @param year 구하고자 하는년도 
	 * @return year전까지의 일수
	 */
	public int calDays(int year) {
		int days =0;
		for(int i =1; i<year; i++) {
			if(isCheckYear(i)) {
				days+=366;
			} else {
				days+=365;
			}
		}
		return days;
	}

	/**
	 * 해당 년도의 입력 월 미만까지의 각 월의 최대 일수를 누적
	 * @param year 월의 윤년 판단
	 * @param month 누적해야 할 1월부터 해당월 전까지의 기준 월
	 * @return 년도 누적 + 월 누적 일 수
	 */
	public int calDays(int year, int month) {
		int days = calDays(year);
		for (int i = 1; i < month; i++) {
			if(isCheckYear(year)) {
				days+=LEAP[i-1];
			}else {
				days+=PLAIN[i-1];
			}
		}
		return days;
	}
	/**
	 * 년도 월 일을 누적하여 해당 년도/월/일의 총 일수를 반환하는 메소드
	 * @param year 해당 년도
	 * @param month 해당 월
	 * @param date 해당 일수
	 * @return year month date의 총 일수
	 */
	public int calDays(int year, int month, int date) {
		int days=calDays(year,month);
		days+=date;
		return days;
	}
	
	
	public void print_Cal(int year, int month) {
		System.out.printf("\t\t %d년도 \t%d월\n",year,month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		Calendar cal = Calendar.getInstance();
		cal.set(year,month-1,1);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK)-1;//1년 1월 1일이 월요일인걸 포함
		int dayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		cal.set(year, month-1-1,1);
		int beforeDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		for (int i = beforeDayOfMonth - dayOfWeek+1; i <= beforeDayOfMonth; i++) {
			System.out.printf("%d\t",i);
		}
		
		

		
		for (int i = 1; i <=dayOfMonth; i++) {
			System.out.printf("%d\t",i);
			if((dayOfWeek+i)%7==0) {
				System.out.println();
			}
		}
		
		int afterDays = (7-(dayOfWeek+dayOfMonth)%7)%7;
		for (int i = 1; i <= afterDays; i++) {
			System.out.printf("%d\t",i);
		}
	}
}
