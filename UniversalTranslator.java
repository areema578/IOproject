package projectIO;

public class UniversalTranslator implements EarthCellPhone{
	
	private AlienCellPhone alienPhone;
	
	public UniversalTranslator(AlienCellPhone alienPhone) {
		this.alienPhone = alienPhone;
	}

	@Override
	public void sendMessage(String languageType, String fileName) throws InvalidLanguageException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readMessage(String fileName) {
		// TODO Auto-generated method stub
		
	}
}
