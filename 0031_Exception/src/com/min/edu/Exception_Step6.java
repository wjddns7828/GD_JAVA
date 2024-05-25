package com.min.edu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//java7부터 try with resource 문법이 추가됨
//try()리소스를 정의하여 사용 할 수 있다.
//try()뒤에 사용되는 리소스를 자동으로 닫아준다.

//기존 방식 
//1) try -> 처리 될 연산 작성(resource == 열고 닫음이 있는 객체)
//2) 연산에 문제가 발생되면 catch를 사용하여 잡아냄
//3) 리소스를 환원해야되는데(close)를 해야 한다면 사용되는 block의 영역 밖에 선언을 하여
// finally block을 통해서 닫아줘야함
public class Exception_Step6 {
	public int calculation() throws FileNotFoundException  { //throws는 나를 사용하는곳 에서 예외처리를 위임하겠다.
		int n = 0;
		try(Scanner scan = new Scanner(System.in);) {
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Checked Exception
		//클래스를 사용 할 때 반드시 예외처리를 통해서 코드를 작성해야 한다.
		try {
			FileReader file1 = new FileReader("Missing.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileReader file2 = new FileReader("Missing.txt");
		FileReader file3 = new FileReader("Missing.txt");
		
		try(file2;file3){
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return n;
	}
}
