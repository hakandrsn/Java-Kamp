package interfaces;

public class MysqlCustomerDal implements ICustomerDal {
    @Override
    public void Add(){
        System.out.println("MYSQL eklendi");
    }
    
}
