package com.args;

import java.util.Scanner;

public class ArgsApp 
{
    public static void main( String[] args )
    {	
    	// Objects
    	Scanner scan = new Scanner(System.in);
    	SchemaUtility schemaUtility = new SchemaUtility();
    	
    	// Variables pertaining to user input.
    	String prompt = "Please enter user input";
    	String userInput = schemaUtility.getUserInput(scan, prompt);
        String directory = schemaUtility.directoryFlagValue(userInput);
    	boolean log = schemaUtility.getLogValue(userInput);	
    	int portFlag = schemaUtility.getPortFlagValue(userInput);      

        // Results
        System.out.println("Log Value: " + log);
        System.out.println("Port Value: " + portFlag);
        System.out.println("Directory Value: " + directory);
    }

}
