package com.min.edu;

public class For_Fn {
	public void make_three() {
		//0,1,2,3,4,5
		//4,3,2,1,0
		for (int i = 0; i < 5; i++) {
			
			System.out.print(i+"\t");
		}
		System.out.println();
		for (int i = 4; i >= 0; i--) {
			
			System.out.print(i+"\t$");
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			
			System.out.print((5-1-i)+"\t@");
		}
	}
			public void make_two() {
		for (int i = 0, j=1; 
				i<5; 
				i++,j--) {
					System.out.println(i+"/"+j);
			
			
				}
			}
}