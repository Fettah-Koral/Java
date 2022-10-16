package kodlamaioDay3HW;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDay3HW.business.*;
import kodlamaioDay3HW.core.logging.*;
import kodlamaioDay3HW.dataAccess.*;
import kodlamaioDay3HW.entity.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		List<Logger>loggers=new ArrayList<>();
		loggers.add(new DatabaseLogger());
		loggers.add(new FileLogger());
		loggers.add(new MailLogger());
		
//		Category category1 = new Category(1, "Yazilim");
//		Category category2 = new Category(2, "Muhendislik");
//		Category category3 = new Category(3, "Muhendislik");
//		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers);
//
//		categoryManager.add(category1);
//		categoryManager.add(category2);
////	categoryManager.add(category3);
//		
//		categoryManager.delete(category1.getId()-1);
//		categoryManager.update(0, category2);
		
//		###################################################################
		
//		Instructor instructor1 = new Instructor(1,"Ali",4);
//		Instructor instructor2 = new Instructor(2,"Hakan",3);
//		
//		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);
//		instructorManager.add(instructor1);
//		instructorManager.add(instructor2);
//		instructorManager.delete(instructor2.getId()-1);
//		instructorManager.update(instructor1.getId()-1, instructor2);
//		System.out.println(instructorManager.findById(1).getName());
		
//		----------------------------------------------------
		
//		for(Instructor instructor :instructorManager.getInstructors()) {
//			System.out.println(instructor.getName());
//		}

		
//		###################################################################
		
		Course course1 = new Course(1, "Java", 55);
		Course course2 = new Course(2, "Css", 20);
		Course course3 = new Course(3, "Css", 30);
		Course course4 = new Course(4, "Sql", -40);
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);
		
		courseManager.add(course1);
		courseManager.add(course2);
//		courseManager.add(course3);
//		courseManager.add(course4);
		
		
		
		
		
		
		
		
	}

}
