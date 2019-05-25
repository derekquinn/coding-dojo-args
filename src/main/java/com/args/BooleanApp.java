package com.args;

public class BooleanApp {

	public boolean logTrue(String input) {
		if (input.contains("-l")) {
		 	return true;
		} else {
			return false;
		}
	}
	
	public int portFlagValue(String input) {
		
		if (input.contains("-p")) {
			return 0;
		}else {
			return 1;
		}
	}
}
