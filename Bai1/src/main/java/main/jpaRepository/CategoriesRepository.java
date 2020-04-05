package main.jpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.model.Categories;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Integer> {
	
}
