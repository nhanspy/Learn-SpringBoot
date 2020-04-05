package main.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import main.jpaRepository.CategoriesRepository;
import main.model.Categories;

@Service
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
	
//	public long countProduct(int idCate) {
//		if (idCate != -1) {
//			Session session = HibernateUtils.getSessionFactory().openSession();
//			String sql = "SELECT COUNT(id) FROM Product WHERE catID=" + idCate;
//			Query query = session.createQuery(sql);
//			return (long) query.uniqueResult();
//		} return (long)repo.count();
//	}
}
