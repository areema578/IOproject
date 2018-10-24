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
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EarthText implements EarthCellPhone{

	private String languageType = "N/A";
	
	public EarthText() {
		
	}
	
	@Override
	public void sendMessage(String languageType, String fileName) throws InvalidLanguageException {
		// TODO Auto-generated method stub
		try {
			if(!languageType.equals("Earth") && !languageType.equals("Klingon") && !languageType.equals("Vulcan")) {
				throw new InvalidLanguageException(languageType);
			}
			File inFile = new File(fileName);
			Scanner in = new Scanner(inFile);
			this.languageType = languageType;
			System.out.println(languageType + " Message Sent");
			in.close();
		} catch (FileNotFoundException exception) {
			System.out.println("File: " + fileName + " does not exist");
		}
	}

	@Override
	public void readMessage(String fileName) {
		// TODO Auto-generated method stub
		try {
			File inFile = new File(fileName);
			Scanner in = new Scanner(inFile);
			while(in.hasNext()) {
				System.out.println(in.nextLine());
			}
			in.close();
		} catch(FileNotFoundException exception) {
			System.out.println("File: " + fileName + " does not exist");
		}
	}
	
	public String toString() {
		return "Earth";
	}

}
