package code.categories.Bai1;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



public class AppController {
	private ProductService productService;
	private CategoriesService cateService;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Product> listProducts = productService.listAll();
		List<Categories> listCates = cateService.listAll();
	    model.addAttribute("listProducts", listProducts);
	    model.addAttribute("listCates", listCates);
		return "index";
	}
}
