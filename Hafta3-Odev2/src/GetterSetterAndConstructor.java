
public class GetterSetterAndConstructor {
	private String firstName;
	private String lastName;
	private int age;
	private String tc;
	
	
	public GetterSetterAndConstructor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GetterSetterAndConstructor(String firstName, String lastName, int age, String tc) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.tc = tc;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTc() {
		return tc;
	}
	public void setTc(String tc) {
		this.tc = tc;
	}
	
}
