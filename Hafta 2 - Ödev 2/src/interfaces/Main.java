package interfaces;

public interface Main {
	public static void main(String[] args) {
		ICustomerDal customerDal = new MysqlCustomerDal();
		customerDal.Add();
		ICustomerDal customerDal1 = new OracleCustomerDal();
		customerDal1.Add();
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());		
		customerManager.add();

	}
}
