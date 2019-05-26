package com.args;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ArgsAppTest

{
	/**
	 * Test to decide whether case is logged or not.
	 *
	 */

	SchemaUtility schemaUtility = new SchemaUtility();
	String directoryDefaultValue = "1";

	@Test
	public void isLogFlagPresent() {
		assertEquals(false, schemaUtility.getLogValue("-z"));
		assertEquals(true, schemaUtility.getLogValue("-l"));
		assertEquals(false, schemaUtility.getLogValue("l"));
	}

	/**
	 * Test to decide if port flag is in user input string.
	 *
	 */
	@Test
	public void isPortFlagPresent() {
		assertEquals(1, schemaUtility.getPortFlagValue("5"));
		assertEquals(8080, schemaUtility.getPortFlagValue("-l -p 8080 -d /usr/logs"));
		assertEquals(8080, schemaUtility.getPortFlagValue("-l -p 8080 -d /usr/logs"));
	}

	/**
	 * Test to decide if directory flag is present in user input string.
	 */

	@Test
	public void isDirectoryFlagPresent() {

		assertEquals(directoryDefaultValue, schemaUtility.directoryFlagValue("-l -p 8080"));
		assertEquals("/usr/logs", schemaUtility.directoryFlagValue("-l -p 8080 -d /usr/logs"));

	}

	@Test
	public void portValueAsAnInteger() {

		assertEquals(8080, schemaUtility.getPortFlagValue("-l -p 8080 -d /usr/logs"));
	}

//	@Test
//	public void TestingTheArgsApp() {
//		ArgsApp argsApp = new ArgsApp();
//		InputStream stdin = System.in;
//		Scanner scnr = new Scanner(System.in);
//		assertEquals("-l -p 8080 -d /usr/logs", argsApp.getUserInput(scnr, "Please enter user input"));
//	}

	/**
	 * The order of the arguments need not match the order given in the schema.
	 */
	public void outOfOrder() {

		return;
	}

	@Test
	public void directoryValueAsString() {

		assertEquals("/usr/logs", schemaUtility.directoryFlagValue("-l -p 8080 -d /usr/logs"));
		assertEquals("/usr/logs", schemaUtility.directoryFlagValue("-l -d /usr/logs -p 8080 -d /usr/logs"));

	}

	/**
	 * have some tests that suitable default values are correctly assigned if flags
	 * given in the schema are missing in the args given.
	 */
	public void defaultValues() {

		return;
	}

}
