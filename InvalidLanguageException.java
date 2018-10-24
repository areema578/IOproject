package projectIO;
/**	
 * Scott Arima and Howard Chen
 * 24 October 2018
 * Purpose of the program- To demonstrate Handling Exceptions using File I/O and 
 * the adapter Design pattern with a Star Trek's Universal Translator for today's 
 * cell phones.
 * Inputs: N/A
 * Output: Exception Messages, CellPhone actions and translated texts.
 */
public class InvalidLanguageException extends Exception {
	
	private String languageType = "N/A";
	
	public InvalidLanguageException(String languageType) {
		this.languageType = languageType;
	}

	public String getMessage() {
		return "Language: " + languageType + " not supported";
	}
	
	public String toString() {
		return "InvalidLanguageException";
	}
}
