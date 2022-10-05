package oopWithNLayerApp;

import oopWithNLayerApp.business.ProductManager;
import oopWithNLayerApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(3,"telefon",55);
		ProductManager productManager = new ProductManager();
		productManager.add(product1);
	}

}
