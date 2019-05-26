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

		int logIndex = input.indexOf("-l");
		int portIndex = input.indexOf("-p");
		int directoryIndex = input.indexOf("-d");

		if (input.contains("-l")) {
			input.replace("-l", "");
		}
		
		if (input.contains("-p")) {
			int portValue = 1;
			if (input.contains("-d") && directoryIndex > portIndex) {
				String portString = input.substring(portIndex + 2, directoryIndex);
				portString = portString.trim();
				portValue = Integer.parseInt(portString);
				return portValue;
			}

			if (input.contains("-d") && directoryIndex < portIndex) {
				String portString = input.substring(portIndex + 2);
				portString = portString.trim();
				portValue = Integer.parseInt(portString);
				return portValue;
			}
			
			return portValue;

		} else {
			return 1;
		}
	}

	public String directoryFlagValue(String input) {

		if (input.contains("-d")) {
			return "/usr/logs";
		} else {
			return directoryDefaultValue;
		}

	}
}
