package com.min.edu.ctrl;

import com.min.edu.H20Impl;
import com.min.edu.sub.Ice;
import com.min.edu.sub.Steam;
import com.min.edu.sub.Water;

public class ChoiceFactory {

	private static ChoiceFactory factory; 
	
	private ChoiceFactory() {
		
	}
	
	
	public static ChoiceFactory getInstance() {
		if(factory ==null) {
			
			factory = new ChoiceFactory();
		}
		return factory;
	}

	public /* static */H20Impl factory(int choice) {
		H20Impl obj = null;

		switch (choice) {
		case 1:
			obj = new Ice();
			break;
		case 2:
			obj = new Water();
			break;
		case 3:
			obj = new Steam();
			break;

		}
		return obj;
	}

}
