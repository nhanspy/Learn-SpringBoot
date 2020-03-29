package code.categories.Bai1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CategoriesService {
	@Autowired
	private CategoriesRepository repo;
	
	public List<Categories> listAll(){
		return repo.findAll();
	}
	
	public void save(Categories categories) {
		repo.save(categories);
	}
	
	public Categories get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
