package com.args;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Unit test for simple App.
 */
public class ArgsAppTest 
    
{
    /**
     * Test to decide whether case is logged or not.
     *
     */
	
	SchemaFlagIdentifier schemaFlagIdentifier = new SchemaFlagIdentifier();
	String directoryDefaultValue = "Directory Missing. Please try again.";
	
	@Test
	public void isLogFlagPresent()
	{
		assertEquals(false, schemaFlagIdentifier.logTrue("-z"));
		assertEquals(true, schemaFlagIdentifier.logTrue("-l"));
		assertEquals(false, schemaFlagIdentifier.logTrue("l"));
	}
	
	 /**
     * Test to decide if port flag is in user input string.
     *
     */
	@Test
    public void isPortFlagPresent()
    {
       assertEquals(1, schemaFlagIdentifier.portFlagValue("5"));
       assertEquals(8080,schemaFlagIdentifier.portFlagValue("-p"));
       assertEquals(8080, schemaFlagIdentifier.portFlagValue("-p9231239 888 blue"));
    }
	
	/**
	 * Test to decide if directory flag is present in user input string. 
	 */
	
	@Test
	public void isDirectoryFlagPresent() {
		
		assertEquals(directoryDefaultValue, schemaFlagIdentifier.directoryFlagValue("-l -p 8080"));
		assertEquals("/usr/logs", schemaFlagIdentifier.directoryFlagValue("-l -p 8080 -d /usr/logs"));
		
		
	}

    /**
     * The order of the arguments need not match the order given in the schema.
     */
    public void outOfOrder()
    {
        return;
    }

    /**
     * have some tests that suitable default values are correctly assigned if flags given in the schema are missing in the args given.
     */
    public void defaultValues()
    {
       return;
    }
}
