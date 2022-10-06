package hafta3odev3.core.logging;

public class DatabaseLogger implements ILogger{

	@Override
	public void log(String msg) {
		System.out.println("database loglandı :" + msg);		
	}

}
