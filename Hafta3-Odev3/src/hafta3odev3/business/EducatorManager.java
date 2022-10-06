package hafta3odev3.business;

import hafta3odev3.core.logging.ILogger;
import hafta3odev3.dataAccess.IDao;
import hafta3odev3.entities.Course;
import hafta3odev3.entities.Educator;

public class EducatorManager {
	
	private Course course;
	private ILogger[] loggers; 
	private Educator educator;
	private IDao dao;
	public EducatorManager(Educator educator,Course course,IDao dao,ILogger[] loggers) {
		this.course= course;
		this.loggers = loggers;
		this.educator = educator;
		this.dao = dao;
	}
	
	public void add() {
		System.out.println("Eğitimcinin vereceği kurs : "+course.getName());
		dao.saveData(educator.getImage());
		for (ILogger iLogger : loggers) {
			iLogger.log(educator.getFirstName());
		}
	}
	
}
