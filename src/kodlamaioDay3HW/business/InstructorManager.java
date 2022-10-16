package kodlamaioDay3HW.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDay3HW.core.logging.Logger;
import kodlamaioDay3HW.dataAccess.InstructorDao;
import kodlamaioDay3HW.entity.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private List<Logger>loggers= new ArrayList<>();

	public InstructorManager(InstructorDao instructorDao,List<Logger>loggers) {
		this.instructorDao = instructorDao;
		this.loggers=loggers;
	}

	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}

	public void delete(int id) {
		instructorDao.delete(id);
	}

	public void update(int id, Instructor instructor) {
		instructorDao.update(id, instructor);
	}

	public Instructor findById(int id) {
		return instructorDao.findById(id);
	}

	public List<Instructor> getInstructors() {
		return instructorDao.getInstructors();
	}

}
