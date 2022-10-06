package Polimorfizm;

public class Main {

	public static void main(String[] args) {
		
		  BaseLogger[] baseLogger = new BaseLogger[] {new ConsoleLogger(),new
		  FileLogger(),new EmailLogger(),new DatabaseLogger(),new OgrenciLogger()}; 
		  for(BaseLogger logs :
		  baseLogger) { logs.Log(234); }
		 
		
		CustomerManager customerManager = new CustomerManager(new ConsoleLogger());
		customerManager.Add();
	}

}
