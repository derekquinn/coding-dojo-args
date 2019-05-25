package com.args;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
    /**
     * Test to decide whether case is logged or not.
     *
     */
	
	BooleanApp booleanApp = new BooleanApp();
	
	@Test
	public void logBoolean()
	{
		assertEquals(true, booleanApp.logTrue());
		
	}
	
	 /**
     * Make sure you have a test with a negative integer (confusing - sign)
     *
     */
    public void negativeInteger()
    {
       
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
