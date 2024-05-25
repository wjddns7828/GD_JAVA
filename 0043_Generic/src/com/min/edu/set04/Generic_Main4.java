package com.min.edu.set04;

public class Generic_Main4 {
	public static void main(String[] args) {
		Printer p = new Printer(new Cat("냥냥이"));
//		Printer p = new Printer(null);
		p.print();
	}
}
