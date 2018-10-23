package projectIO;

public class InvalidLanguageException extends Exception {
	
	private String languageType = "N/A";
	
	public InvalidLanguageException(String languageType) {
		this.languageType = languageType;
	}

	public String getMessage() {
		return "Language: " + languageType + " not supported";
	}
}
