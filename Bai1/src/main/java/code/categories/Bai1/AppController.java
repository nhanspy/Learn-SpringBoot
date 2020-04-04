package code.categories.Bai1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	@Autowired
	private ProductService productService;
	@Autowired
	private CategoriesService cateService;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Product> listProducts = productService.listAll();
//		System.out.println("Tran Viet Nhan : ------- " + list.toString());
		List<Categories> listCates = cateService.listAll();
	    model.addAttribute("listProducts", listProducts);
	    model.addAttribute("listCates", listCates);
		return "index";
	}
	
	@RequestMapping("/cate/{id}")
	public String view(@PathVariable(name = "id") int id, Model model) {
		List<Product> listProducts = productService.getProductByIdCate(id);
		List<Categories> listCates = cateService.listAll();
	    model.addAttribute("listProducts", listProducts);
	    model.addAttribute("listCates", listCates);
		return "index";
	}
}
