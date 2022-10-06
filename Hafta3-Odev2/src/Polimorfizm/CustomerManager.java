package Polimorfizm;

public class CustomerManager {
	private BaseLogger baseLogger;
	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger= baseLogger;
	}
	public void Add() {
		System.out.println("müşteri eklendi");
		this.baseLogger.Log(233);
	}
}
