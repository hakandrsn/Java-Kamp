package hafta3odev3.core.logging;

public class FileLogger implements ILogger{

	@Override
	public void log(String msg) {
		System.out.println("Dosyaya loglandı : "+msg);	
	}

}
