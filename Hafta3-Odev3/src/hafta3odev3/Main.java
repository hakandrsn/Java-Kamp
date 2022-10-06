package hafta3odev3;

import hafta3odev3.business.CategoryManager;
import hafta3odev3.business.CourseManager;
import hafta3odev3.business.EducatorManager;
import hafta3odev3.core.logging.DatabaseLogger;
import hafta3odev3.core.logging.FileLogger;
import hafta3odev3.core.logging.ILogger;
import hafta3odev3.core.logging.MailLogger;
import hafta3odev3.dataAccess.HibernateDao;
import hafta3odev3.dataAccess.IDao;
import hafta3odev3.dataAccess.JdbsDao;
import hafta3odev3.entities.Category;
import hafta3odev3.entities.Course;
import hafta3odev3.entities.Educator;

public class Main {

	public static void main(String[] args) {
		ILogger[] educatorLogger = new ILogger[] {new DatabaseLogger(),new FileLogger(), new MailLogger()};
		ILogger[] courseLogger = new ILogger[] {new DatabaseLogger(),new FileLogger()};
		ILogger[] categoryLogger = new ILogger[] {new DatabaseLogger()};
		
		IDao hibernateDao= new HibernateDao();
		IDao jdbsDao = new JdbsDao();
		Educator educator = new Educator(2,"hakan","dursun","resim");
		Course course = new Course(4,"Java",65,"hakan dursun","yazılım",90);
		Category category = new Category(9,"Yazılım");
		
		CategoryManager categoryManager = new CategoryManager(category, categoryLogger, jdbsDao);
		categoryManager.add();
		
		EducatorManager educatorManager = new EducatorManager(educator,course,hibernateDao,educatorLogger);
		educatorManager.add();
		
		CourseManager courseManager = new CourseManager(course, educator,jdbsDao,courseLogger);
		 courseManager.add();
		 
		 
	}

}
