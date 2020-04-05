package main.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import main.DTO.ProductDTO;
import main.model.Product;

@Mapper
public interface ProductMapper {
	ProductDTO productToProductDTO(Product product);

	List<ProductDTO> toProductsDTO(List<Product> products);
//	@Bean
//	Product productDTOtoProduct(ProductDTO productDTO);
}
