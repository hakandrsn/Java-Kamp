package business;
import entities.Customer;

public class CustomerManager {
	private Customer customer;
	private CredictManager credictManager;
	
	public CustomerManager(Customer customer,CredictManager credictManager) {
		this.customer=customer;
		this.credictManager=credictManager;
	}

	public void save() {
		System.out.println(customer.getFirstName());
	}
	public void GiveCredit() {
		credictManager.Save();
	}
}
