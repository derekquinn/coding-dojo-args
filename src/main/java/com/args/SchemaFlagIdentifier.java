package com.args;

public class SchemaFlagIdentifier {
	
	String directoryDefaultValue = "Directory Missing. Please try again.";

	public boolean logTrue(String input) {
		if (input.contains("-l")) {
		 	return true;
		} else {
			return false;
		}
	}
	
	public int portFlagValue(String input) {
		
		if (input.contains("-p")) {
			return 8080;
		}else {
			return 1;
		}
	}
	
	public String directoryFlagValue(String input) {
		
		if(input.contains("-d")) {
			return "/usr/logs";
		} else {
			return directoryDefaultValue;
		}
		
	}
}
