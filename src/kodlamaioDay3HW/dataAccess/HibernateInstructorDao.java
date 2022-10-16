package kodlamaioDay3HW.dataAccess;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDay3HW.entity.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	private List<Instructor> instructors = new ArrayList<>();

	@Override
	public void add(Instructor instructor) {
		instructors.add(instructor);
		System.out.println("Egitmen Hibernate ile veritabanina eklendi.");

	}

	@Override
	public void delete(int id) {
		instructors.remove(id);
		System.out.println("Egitmen silindi.");
	}

	@Override
	public void update(int id, Instructor instructor) {
		instructors.set(id, instructor);
		System.out.println("Egitmen guncellendi.");
	}

	@Override
	public Instructor findById(int id) {
//		listelerde index 0 dan başladığı için -1 eklendi.
		return instructors.get(id-1);
	}

	@Override
	public List<Instructor> getInstructors() {
		return instructors;
	}

}
