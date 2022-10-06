package hafta3odev3.core.logging;

public class MailLogger implements ILogger{

	@Override
	public void log(String msg) {
		System.out.println("Maile loglandı : "+msg);	
	}

}
