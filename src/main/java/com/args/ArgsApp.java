package com.args;

/**
 * Hello world!
 *
 */
public class ArgsApp 
{
    public static void main( String[] args )
    {
    	SchemaFlagIdentifier schemaFlagIdentifier = new SchemaFlagIdentifier();
    	int portFlag = schemaFlagIdentifier.portFlagValue("-l -p 8080 -d /usr/logs");
        System.out.println("PF" + portFlag);
        
        String directory = schemaFlagIdentifier.directoryFlagValue("-l -p 8080 -d /usr/logs");
        
        System.out.println("Dir" + directory);
        
    }
}
