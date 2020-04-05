package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import main.jpaRepository.ProductRepository;
import main.model.Product;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;
	
	public List<Product> listAll(){
		return repo.findAll();
	}
	
	public void save(Product productDTO) {
		repo.save(productDTO);
	}
	
	public Product get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	public List<Product> getProductByIdCate(int idCate){
		List<Product> list = this.listAll();
		List<Product> listAfter = this.listAll();
		listAfter.clear();
		for (Product product : list) {
			if (product.getCatID() == idCate) {
				listAfter.add(product);
			}
		}
		return listAfter;
	}
	
//	public int countProductOfCate(int idCate) {
//		
//	}
	
	
}
