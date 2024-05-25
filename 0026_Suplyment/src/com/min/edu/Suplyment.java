package com.min.edu;

public class Suplyment {
	//matches(String regex)   
	   public void fn_matches() {
	      String msg = "사과 청사과 오렌지";
	      boolean isc = msg.contains("사과");
	      System.out.println(isc);
	      boolean isc2 = msg.matches("(.*)사과(.*)");
	      boolean isc3 = msg.matches("\\b사과\\b");
	      System.out.println(isc2);
	      System.out.println(isc3);
	      
	      String str = "yes";
	      System.out.println(str.matches("[Yy]es"));
	      
	      String strNum = "aaa133";
	      System.out.println(strNum.matches("a*[0-3]*"));
	   }
	   
	   //replace(char oldChar, char newChar)
	   //replaceAll(String regex, String replacement)
	   public void fn_replace() {
	      String str = "pulse";   //맥박
	      String strChange = "purse";   //지갑
	      String change = str.replace("l", "r");
	      System.out.println(change);      
	   }
	   public void fn_replaceAll() {
	      String str = "!T%1234&f";
	      String regex = "[^0-9a-zA-Z]";
	      String regex2 = "[^0-9]";   //숫자만 빼고 다
	      String result1 = str.replaceAll(regex, "");
	      String result2 = str.replaceAll(regex2, "");
	      System.out.println(result1);
	      System.out.println(result2);
	   }
}
