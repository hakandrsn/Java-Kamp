package staticDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.name= "tefal";
		product.price=33;
		manager.add(product);
	}

}
