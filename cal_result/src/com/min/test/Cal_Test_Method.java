package com.min.test;

public class Cal_Test_Method {
	private final int [ ] LEAP = {31,29,31,30,31,30,31,31,30,31,30,31};
	private final int [ ] PLAIN = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		public boolean isCheckYear(int year) {
			boolean isc = false;
				if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					isc = true;
				}
				return isc;
		}
		public int getDayOfMonth(int year, int month) {
			int day =0;
				if(isCheckYear(year)) {
					day = LEAP[month-1];
				}else {
					day = PLAIN[month-1];
				}
			return day;
		}
		
		public int calDays(int year) {
			int a = 0;
				for(int i = 1; i<year; i++) {
					if(isCheckYear(i)) {
						a+=366;
					}else {
						a+=365;
					}
				}
				return a;
		}
		
		public int calDays(int year, int month) {
			int a =calDays(year);
				for(int i = 1; i<month; i++) {
					if(isCheckYear(year)) {
						a+=LEAP[i-1];
					}else {
						a+=PLAIN[i-1];
					}
				}
				return a;
		}
		
		public int calDays(int year, int month, int date) {
			int a = calDays(year, month);
				a += date;
				return a;
		}
		
		
		public void Print_Cal(int year,int month) {
			System.out.printf("%d년 \t %d월\n",year,month);
			System.out.print("일\t월\t화\t수\t목\t금\t토");
			int dayOfWeek = (calDays(year, month, 1)-1+1)%7;
			int dayOfMonth = getDayOfMonth(year, month);
			
			int beforeDayofMonth = getDayOfMonth(year, month);
			int beforeStart = beforeDayofMonth-dayOfWeek;
			int afterDays = (7-(dayOfWeek+dayOfMonth)%7)%7;
			
			for (int i = beforeStart; i < beforeDayofMonth; i++) {	
				System.out.printf("%d\t",i);
			}
			for (int i = 1; i <= dayOfMonth; i++) { //몇 월 까지 있을까요?
				System.out.printf("%d\t",i);
				if((dayOfWeek+i)%7==0) {
					System.out.println();
				}
			}//달력의 일 수
			
			for (int i = 1; i <= afterDays; i++) {
				System.out.printf("%d\t",i);
			}
		}
		private int getDayOfMonthCheck(int year, int month) {
			 int resultDate = 0;
			 	if(month==1) {
			 		resultDate = getDayOfMonth(year-1, 12);
			 	}else {
			 		resultDate = 31;
			 	}
			return resultDate;
		}
		
	}//printcal