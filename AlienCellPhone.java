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
public interface AlienCellPhone {
	public void alienSendText(String fileName);
	public void alienReadText(String fileName);
	//translateText returns the name of the output file
	//that has the translated message
	public String translateText(String fileName);
}
