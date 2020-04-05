package main.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import main.DTO.CategoriesDTO;
import main.model.Categories;

@Mapper
@Configuration
public interface CategoriesMapper {
	
	CategoriesDTO categoriesToCategoriesDTO(Categories categories);
	
	List<CategoriesDTO> toCategoriesDTO(List<Categories> categories);
//	@Bean
//	Categories categoriesDTOtoCategories(CategoriesDTO cateProductDTO);
}
