import business.CustomerManager;
import business.TeacherCredictManager;
import entities.Company;
import entities.Person;

public class Main {

	public static void main(String[] args) {
//		Customer customer = new Customer();
//		customer.setFirstName("hakan");
//		customer.setId(2);
//		customer.setLastName("dursun");
//		
//		
//		CustomerManager customerManager = new CustomerManager(customer);
//		customerManager.save();
		
		Person c2 = new Person();
		c2.setFirstName("hakkı");
		c2.setLastName("durmaz");
		c2.setId(2);
		c2.setTc("1234123");
		Company c3 = new Company();
		c3.setTaxNumber("23423");
		CustomerManager customerManager2 = new CustomerManager(c2,new TeacherCredictManager());
		customerManager2.save();
		customerManager2.GiveCredit();
	}

}
