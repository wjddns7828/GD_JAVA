package com.min.edu.set04;

public class Cat extends Animal {
	
	private String catName;

	
	public Cat(String catName) {
		super();
		this.catName = catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatName() {
		return catName;
	}

	@Override
	public String toString() {
		return ">>>>>>>>>"+catName;
	}
	
}
