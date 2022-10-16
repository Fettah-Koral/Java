package kodlamaioDay3HW.dataAccess;

import java.util.List;

import kodlamaioDay3HW.entity.Course;

public interface CourseDao {

	void add(Course course);

	void delete(int id);

	void update(int id, Course course);

	Course findById(int id);

	List<Course> getCourses();
}
