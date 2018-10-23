package projectIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UniversalTranslator implements EarthCellPhone{
	
	private AlienCellPhone alienPhone;
	
	public UniversalTranslator(AlienCellPhone alienPhone) {
		this.alienPhone = alienPhone;
	}

	@Override
	public void sendMessage(String languageType, String fileName) throws InvalidLanguageException {
		// TODO Auto-generated method stub
		if(languageType != "Earth" || languageType != "Klingon" || languageType != "Vulcan") {
			throw new InvalidLanguageException(languageType);
		}
		try {
			File inFile = new File(fileName);
			Scanner in = new Scanner(inFile);
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
			System.out.print(""); //language type
			while(in.hasNext()) {
				System.out.println(in.nextLine());
			}
			in.close();
		} catch(FileNotFoundException exception) {
			System.out.println("File: " + fileName + " does not exist");
		}
	}
}
