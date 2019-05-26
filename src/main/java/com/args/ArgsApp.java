package com.args;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class ArgsApp 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	SchemaFlagIdentifier schemaFlagIdentifier = new SchemaFlagIdentifier();
    	String prompt = "Please enter user input";
    	
    	String result = getString(scan, prompt);
    	
    	boolean log = schemaFlagIdentifier.logTrue(result);
    	
    	int portFlag = schemaFlagIdentifier.portFlagValue(result);
        
        String directory = schemaFlagIdentifier.directoryFlagValue(result);
        
        System.out.println(log);
        System.out.println(portFlag);
        System.out.println(directory);
    }
    
    public static String getString(Scanner scnr, String prompt) {
		
		System.out.print(prompt);
		return scnr.nextLine();
	}
    
    public static String getStringMatchingRegex(Scanner scnr, String prompt, String regex) {
		boolean isValid;
		String input;
		do {
			input = getString(scnr, prompt);
		
			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Input must match the appropriate format.");
				isValid = false;
			}
		
		} while (!isValid);
		return input;
    
    }
}
