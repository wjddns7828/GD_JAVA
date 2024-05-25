package com.min.edu;

public class ValueMN {
	
	
	private double m;
	private double n;

	public ValueMN(double m, double n) {
		super();
		this.m = m;
		this.n = n;
	}
	
	public double getM() {
		return m;
	}


	@Override
	public String toString() {
		return "ValueMN [m=" + m + ", n=" + n + "]";
	}

	public void setM(double m) {
		this.m = m;
	}


	public double getN() {
		return n;
	}


	public void setN(double n) {
		this.n = n;
	}

	
}
