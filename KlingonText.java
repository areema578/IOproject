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
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KlingonText implements AlienCellPhone{
	
	public KlingonText() {
		
	}
	
	@Override
	public void alienSendText(String fileName) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Method not in use.");
	}

	@Override
	public void alienReadText(String fileName) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Method not in use.");
	}

	@Override
	public String translateText(String fileName) {
		// TODO Auto-generated method stub
		try {
			File inFile = new File(fileName);
			Scanner in = new Scanner(inFile);
			PrintWriter out = new PrintWriter("KlingonTranslated.txt");
			String translatedText = "";
			while(in.hasNext()) {
				String str = in.nextLine();
				List<String> letters = Arrays.asList(str.split(""));
				Collections.shuffle(letters);
				for(String letter : letters) {
					translatedText += letter;
				}
				out.println(translatedText);
			}
			in.close();
			out.close();
			return translatedText;
		} catch(FileNotFoundException exception) {
			return "File: " + fileName + " does not exist";
		}
	}
	
	public String toString() {
		return "Klingon";
	}

}
