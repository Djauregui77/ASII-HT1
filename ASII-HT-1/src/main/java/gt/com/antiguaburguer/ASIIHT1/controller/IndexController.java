package gt.com.antiguaburguer.ASIIHT1.controller;

import java.util.ArrayList;

import gt.com.antiguaburguer.ASIIHT1.service.impl.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gt.com.antiguaburguer.ASIIHT1.service.impl.IProductosServiceImpl;
import gt.com.antiguarburguer.ASIIHT1.service.IMenuService;


@Controller
@RequestMapping("/")
public class IndexController {
	@Autowired
	private IMenuService service;

	private OrdenService ordenServicio;

	@GetMapping(value = "/")
	public String index(){
		return "Menu";
	}
	
	@GetMapping("/api")
    public String Saludo(@RequestParam String nombre, Model mimodelo){
        //return "Hola Sr." + nombre;
        mimodelo.addAttribute("name",nombre);
        return "Index"; //nombre de la plantilla
    }	
	
	@GetMapping("/ejemplosuma")
	public String Suma(@RequestParam int numero1, @RequestParam int numero2, Model mimodelo) {
		mimodelo.addAttribute("sum", numero1+numero2);
		return "Index"; //nombre de la plantilla
	}
	
	@RequestMapping("/showmenu")
    public String product(Model model) {
		/*ArrayList<String[]> list = new ArrayList<String[]>();
		list.add(new String[] {"1","10","1","1"});
		list.add(new String[] {"2","12","1","1"});
		model.addAttribute("menulist", list);
        model.addAttribute("products", productRepository.findAll());*/
        return "Menu";
    }
	
	
	
	@GetMapping("/mostrar")
	public String mostrarMenus(Model model) {
	    model.addAttribute("menu", service.listar());
	    return "Menu";
	}
	
	
	//@PostMapping
	@RequestMapping("/addmenu")
	public String save(@RequestParam String prodName, @RequestParam String prodId, Model mimodelo) {
		mimodelo.addAttribute("item", prodName);
	//return "saludo" + product.getId();
		return "redirect:mostrar";
		//return new ModelAndView("redirect:/addmenu", mimodelo);
	}
}
