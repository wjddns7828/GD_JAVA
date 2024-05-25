package com.min.edu;

import java.util.Calendar;
import java.util.GregorianCalendar;

//TODO 001 java.util.Calendar의 API 사용 방법
public class CalendarAPI_Use_Main {
 
	public static void main(String[] args) {
		//calendar_API.java의 
		//dayofweek, << 그 달의 시작 날짜 (요일)
		//  -> (연 누적 + 월 누적 + 일 누적 + 1년 1월 1일의 요일 -전달의 마지막요일 - 1 )%7
		//dayofmonth; << 그 달의 일 수
		//	-> 입력년 월의 최대 일수(array로 값이 고정 되어 있음), 윤년 => LEAP / 평년 => PLAIN
		//
		
		//java의 달력 관련 클래스를 제공해 준다
		//java.util.Calendar
		//날짜 관련 클래스 : java.util.Date, java.sql.Date, java.util.calendar
		//java.util.Date d = newDate(22); // Deprecate된 메소드이기 때문에 사용을 지양하세요
		Calendar cal = Calendar.getInstance();
		Calendar gcal = new GregorianCalendar();
		
		System.out.println("현재 년도 : "+cal.get(Calendar.YEAR));
		
		//일요일은 1로 시작된다.
		System.out.println("현재 요일 : "+cal.get(cal.DAY_OF_WEEK));
		
		//입력값 세팅, month는 array로 되어있기 떄문에 입력시 -1을 해준 값으로 입력을 해야줘야합니다.
		gcal.set(2023,4-1,1);
		System.out.println("현재 년도 : "+gcal.get(Calendar.YEAR));
		System.out.println("현재 요일 : "+gcal.get(cal.DAY_OF_WEEK));
		System.out.println(gcal.toString());
		
		System.out.println("현재월의 최대 일 수 "+gcal.getActualMaximum(Calendar.DAY_OF_MONTH));
	}
}
