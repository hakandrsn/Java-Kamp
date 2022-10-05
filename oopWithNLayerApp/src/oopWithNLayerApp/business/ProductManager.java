package oopWithNLayerApp.business;

import oopWithNLayerApp.dataAccess.jdbsProductDao;
import oopWithNLayerApp.entities.Product;

//throw Exception hata fırlatılabilir demek
public class ProductManager {
	public void add(Product product) throws Exception {
		//iş kuralları business rules
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
		}
		jdbsProductDao productDao = new jdbsProductDao();
		productDao.Add(product);
	}
}
