package com.args;

import static org.junit.Assert.assertEquals;

import java.io.InputStream;
import java.util.Scanner;

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

	SchemaFlagIdentifier schemaFlagIdentifier = new SchemaFlagIdentifier();
	String directoryDefaultValue = "1";

	@Test
	public void isLogFlagPresent() {
		assertEquals(false, schemaFlagIdentifier.logTrue("-z"));
		assertEquals(true, schemaFlagIdentifier.logTrue("-l"));
		assertEquals(false, schemaFlagIdentifier.logTrue("l"));
	}

	/**
	 * Test to decide if port flag is in user input string.
	 *
	 */
	@Test
	public void isPortFlagPresent() {
		assertEquals(1, schemaFlagIdentifier.portFlagValue("5"));
		assertEquals(8080, schemaFlagIdentifier.portFlagValue("-l -p 8080 -d /usr/logs"));
		assertEquals(8080, schemaFlagIdentifier.portFlagValue("-l -p 8080 -d /usr/logs"));
	}

	/**
	 * Test to decide if directory flag is present in user input string.
	 */

	@Test
	public void isDirectoryFlagPresent() {

		assertEquals(directoryDefaultValue, schemaFlagIdentifier.directoryFlagValue("-l -p 8080"));
		assertEquals("/usr/logs", schemaFlagIdentifier.directoryFlagValue("-l -p 8080 -d /usr/logs"));

	}

	@Test
	public void portValueAsAnInteger() {

		assertEquals(8080, schemaFlagIdentifier.portFlagValue("-l -p 8080 -d /usr/logs"));
	}

	@Test
	public void TestingTheArgsApp() {
		ArgsApp argsApp = new ArgsApp();
		InputStream stdin = System.in;
		Scanner scnr = new Scanner(System.in);
		stdin = -l -p 8080 -d /usr/logs;
		assertEquals("-l -p 8080 -d /usr/logs", argsApp.getString(scnr, "Please enter user input"));
	}
	
	/**
	 * The order of the arguments need not match the order given in the schema.
	 */
	public void outOfOrder() {

		return;
	}

	@Test
	public void directoryValueAsString() {
		
		assertEquals("/usr/logs", schemaFlagIdentifier.directoryFlagValue("-l -p 8080 -d /usr/logs"));
		assertEquals("/usr/logs", schemaFlagIdentifier.directoryFlagValue("-l -d /usr/logs -p 8080 -d /usr/logs"));
		
	}

	/**
	 * have some tests that suitable default values are correctly assigned if flags
	 * given in the schema are missing in the args given.
	 */
	public void defaultValues() {

		return;
	}
	
}
