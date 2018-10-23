package projectIO;

import java.io.FileNotFoundException;

public class EarthText implements EarthCellPhone{

	public EarthText() {
		
	}
	
	@Override
	public void sendMessage(String languageType, String fileName) throws InvalidLanguageException {
		// TODO Auto-generated method stub
		try {
			
		} catch (FileNotFoundException exception) {
			throw new InvalidLanguageException(languageType);
		}
		
	}

	@Override
	public void readMessage(String fileName) {
		// TODO Auto-generated method stub
		
	}

}
