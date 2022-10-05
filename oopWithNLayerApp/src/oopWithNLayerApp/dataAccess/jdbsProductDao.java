package oopWithNLayerApp.dataAccess;

import oopWithNLayerApp.entities.Product;

//dao dataaccess
public class jdbsProductDao {
	public void Add(Product product) {
		//sadece ve sadece db erişim kodları yazılır
		System.out.println("JDBS ile veritabanına eklendi");
	}
	
}
