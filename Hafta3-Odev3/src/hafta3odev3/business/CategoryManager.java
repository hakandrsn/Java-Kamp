package hafta3odev3.business;

import hafta3odev3.core.logging.ILogger;
import hafta3odev3.dataAccess.IDao;
import hafta3odev3.entities.Category;

public class CategoryManager {
	private ILogger[] loggers;
	private IDao dao;
	private Category category;

	public CategoryManager(Category category, ILogger[] loggers, IDao dao) {
		this.loggers = loggers;
		this.dao = dao;
		this.category = category;
	}

	public void add() {
		System.out.println("Kategori eklendi : " + category.getName());
		dao.getData("DB den mevcut kurslar getirildi");
		if ("kurs varsa" == category.getName()) {
			System.out.println("kurs ismi tekrar etti");
		} else {
			dao.saveData("Eklenen kategori : "+category.getName());
			for (ILogger iLogger : loggers) {
				iLogger.log(category.getName());
			}
		}
	}
}
