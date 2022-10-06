package hafta3odev3.business;

import hafta3odev3.core.logging.ILogger;
import hafta3odev3.dataAccess.IDao;
import hafta3odev3.entities.Course;
import hafta3odev3.entities.Educator;

public class CourseManager {

	private Educator educator;
	private ILogger[] loggers;
	private Course course;
	private IDao dao;

	public CourseManager(Course course, Educator educator, IDao dao, ILogger[] loggers) {
		this.educator = educator;
		this.loggers = loggers;
		this.course = course;
		this.dao = dao;
	}

	public void add() {
		dao.getData("Category getir");
		if (course.getName() == "gelen name") {
			System.out.println("Aynısı var");
		}else if(course.getPrice()<0) {
			System.err.println("Kurs fiyatı 0 dan küçük olamaz");
		}
		else {
			System.out.println("kurs eklendi, hocası : " + educator.getFirstName() + " " + educator.getLastName());
			dao.saveData(course.getCategory());
			for (ILogger iLogger : loggers) {
				iLogger.log(course.getName());
			}
		}

	}
}
