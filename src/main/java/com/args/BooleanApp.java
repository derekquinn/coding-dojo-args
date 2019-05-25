package com.args;

public class BooleanApp {

	public boolean logTrue(String input) {
		if (input.contains("-l")) {
		 	return true;
		} else {
			return false;
		}
	}
}
