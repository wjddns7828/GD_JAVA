package com.min.lotto;

import java.util.Arrays;
import java.util.Calendar;

public class Lotto_DTO {
	int money;
	String[] y = {"일","월","화","수","목","금","토"};
	
	Calendar cal = Calendar.getInstance();
	
	int[][]lotto;
	
	int[] today = {cal.get(Calendar.YEAR),
			cal.get(Calendar.MONTH)+1,
			cal.get(Calendar.DATE)};
	
	int[] time = {cal.get(Calendar.HOUR_OF_DAY)
			,cal.get(Calendar.MINUTE),
			cal.get(Calendar.SECOND)};
}
