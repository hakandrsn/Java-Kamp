package hafta3odev3.entities;

public class Course {
	private int id;
	private String name;
	private int complatepercent;
	private String educator;
	private String category;
	private double price;
	public Course() {
		super();
	}
	public Course(int id, String name, int complatepercent, String educator,String category,double price) {
		super();
		this.id = id;
		this.name = name;
		this.complatepercent = complatepercent;
		this.educator = educator;
		this.category= category;
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getComplatepercent() {
		return complatepercent;
	}
	public void setComplatepercent(int complatepercent) {
		this.complatepercent = complatepercent;
	}
	public String getEducator() {
		return educator;
	}
	public void setEducator(String educator) {
		this.educator = educator;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
