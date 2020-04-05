package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import main.DTO.CategoriesDTO;
import main.DTO.ProductDTO;
import main.Mapper.CategoriesMapper;
import main.Mapper.ProductMapper;
import main.service.CategoriesService;
import main.service.ProductService;

@Controller
public class AppController {
	@Autowired
	private ProductService productService;
	@Autowired
	private ProductMapper productMapper;
	@Autowired
	private CategoriesService cateService;
	@Autowired
	private CategoriesMapper categoriesMapper;
	
	@RequestMapping("/cate")
	public String viewHomePage(Model model) {
		List<ProductDTO> listProductDTOs = productMapper.toProductsDTO(productService.listAll());
		System.out.println(listProductDTOs.toString());
		List<CategoriesDTO> listCateDTOs = categoriesMapper.toCategoriesDTO(cateService.listAll());
		
	    model.addAttribute("listProducts", listProductDTOs);
	    model.addAttribute("listCates", listCateDTOs);
		return "index";
	}
	
	@RequestMapping("/cate/{id}")
	public String view(@PathVariable(name = "id") int id, Model model) {
		List<ProductDTO> listProductDTOs = productMapper.toProductsDTO(productService.getProductByIdCate(id));
		List<CategoriesDTO> listCateDTOs = categoriesMapper.toCategoriesDTO(cateService.listAll());
		
	    model.addAttribute("listProducts", listProductDTOs);
	    model.addAttribute("listCates", listCateDTOs);
		return "index";
	}
}
