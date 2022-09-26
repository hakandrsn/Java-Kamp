package inheritance;

public class Main {

	public static void main(String[] args) {
	    Customer customer=new Customer();
        Employee employee=new Employee();
        customer.firstName="İlknur";
        employee.firstName="Ayşe";


        EmployeeManager employeeManager=new EmployeeManager();
        CustomerManager customerManager=new CustomerManager();

        customerManager.Add();
        employeeManager.BestEmployee();

	}

}
