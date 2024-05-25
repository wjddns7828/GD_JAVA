package com.min.lotto.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TestNumMain {
	public static void main(String[] args) {
		int [][]a = new int [2][2];
		
		a[0][1] = 3;
		System.out.println(Arrays.toString(a));
		
		
		
		int cnt = 2;
		TestNum tn = new TestNum();
//		for (int i = 0; i < a.length; i++){
//		
//			for (int j = i + 1; j < a.length; j++){
//			
//				if (a[i] != 0 && a[i]==(a[j])) {
//					a[j]=0;
//				}
//			}
			boolean isc = tn.isValueInArray(a, cnt);
			System.out.println(isc);
		}
		






				
		//		int [][]testarr = new int [6][6];
		//		
		//		for (int i = 0; i < testarr.length; i++) {
		//			testarr[i] = tn.lottoNum();
		//		}		
		//		int [][] lottonum = new int [2][6];
		//		Scanner scan = new Scanner(System.in);
		//		System.out.println("Y/N");
		//		for(int j = 0; j<2;j++) {
		//			boolean isc =false;
		//		for (int i = 0; i < 6; i++) {
		//			lottonum[j][i]=tn.rdnum();			
		//			while (isc == false) {
		//				System.out.println("숫자 입력");
		//				String a = scan.nextLine();
		//				if(a.equals("그만")) {
		//					isc=true;
		//				}else {
		//					lottonum[j][i] = Integer.parseInt(a);
		//					i++;
		//					if(i == 6) {
		//						isc=true;
		//					}
		//				}
		//			}
		//		}
		//	}
		//		System.out.println(lottonum.length);
}
