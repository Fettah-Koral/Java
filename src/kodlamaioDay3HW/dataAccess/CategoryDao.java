package kodlamaioDay3HW.dataAccess;

import java.util.List;

import kodlamaioDay3HW.entity.Category;

public interface CategoryDao {
	void add(Category category);

	void delete(int id);

	void update(int id, Category category);

	Category findById(int id);

	List<Category> getCategories();
}
