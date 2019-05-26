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

		if (input.contains("-l")) {
			input.replace("-l", "");
		}

		if (input.contains("-p")) {
			int portValue = 1;

			if (input.contains("-d") && directoryIndex > portIndex) {
				String portString = input.substring(portIndex + 2, directoryIndex);
				// portString = portString.trim();
				// portValue = Integer.parseInt(portString);
				return trimAndParse(portString);
				// return portValue;
			}

			if (input.contains("-d") && directoryIndex < portIndex) {
				String portString = input.substring(portIndex + 2);
//				portString = portString.trim();
//				portValue = Integer.parseInt(portString);
//				return portValue;
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

		if (input.contains("-l")) {
			input.replace("-l", "");
		}

		if (input.contains("-d")) {

			if (input.contains("-p") && directoryIndex > portIndex) {

				directory = input.substring(directoryIndex + 2);
				directory = directory.trim();
				return directory;
			}

			if (input.contains("-p") && directoryIndex < portIndex) {

				directory = input.substring(directoryIndex + 2, portIndex);
				directory = directory.trim();
				return directory;
			}
		}

		else {
			return "1";
		}

		return "1";

	}

	public int trimAndParse(String portString) {
		portString = portString.trim();
		int portValue = Integer.parseInt(portString);

		return portValue;
	}
}
