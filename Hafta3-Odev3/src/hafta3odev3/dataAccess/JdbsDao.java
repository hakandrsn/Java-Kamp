package hafta3odev3.dataAccess;

public class JdbsDao implements IDao {

	@Override
	public void saveData(String msg) {
		System.out.println(msg);
		
	}

	@Override
	public void getData(String msg) {
		System.out.println(msg);
	}


}
