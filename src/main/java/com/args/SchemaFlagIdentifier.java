package com.args;

public class SchemaFlagIdentifier {

	String directoryDefaultValue = "Directory Missing. Please try again.";
	String portDefaultValue = "Port missing. Please try again.";

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

		replaceLogFlag(input);
		

		if (input.contains("-p")) {
			int portValue = 1;

			if (input.contains("-d") && directoryIndex > portIndex) {
				String portString = input.substring(portIndex + 2, directoryIndex);
				return trimAndParse(portString);
			}

			if (input.contains("-d") && directoryIndex < portIndex) {
				String portString = input.substring(portIndex + 2);
				return trimAndParse(portString);

			} else {
				return 1;
			}
		}
		return 1;
	}

	public String directoryFlagValue(String input) {

		int logIndex = input.indexOf("-l");
		int portIndex = input.indexOf("-p");
		int directoryIndex = input.indexOf("-d");
		String directory;

		replaceLogFlag(input);

		if (input.contains("-d")) {

			if (input.contains("-p") && directoryIndex > portIndex) {

				directory = input.substring(directoryIndex + 2).trim();
				return directory;
			}

			if (input.contains("-p") && directoryIndex < portIndex) {

				directory = input.substring(directoryIndex + 2, portIndex).trim();
				return directory;
			}
		}

		else {
			return "1";
		}

		return "1";

	}

	public int trimAndParse(String input) {
		
		input = input.trim();
		int portValue = Integer.parseInt(input);
		return portValue;
	}
	
	
	public void replaceLogFlag(String input) {
		if(input.contains("-1")) {
			input.replace("-1","");
		}
	}
}
