package gt.com.antiguaburguer.ASIIHT1.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gt.com.antiguaburguer.ASIIHT1.model.Orden;
import gt.com.antiguaburguer.ASIIHT1.service.impl.MenuServiceImpl;
import gt.com.antiguaburguer.ASIIHT1.service.impl.OrdenService;

@Controller
@RequestMapping("/cocinero")
public class Cocinero {
    @Autowired
    private OrdenService ordenService;

    @Autowired
    private MenuServiceImpl menuService;
	@GetMapping(value = "")
    public String index(Model model){
        model.addAttribute("menus",menuService.listar());
        model.addAttribute("ordenes",ordenService.listar());
        System.out.println(menuService.listar());
        return "Cocinero";
    }
	 @RequestMapping(value = "/terminarorden",method = RequestMethod.GET)
	    public String terminarOrden(@RequestParam String operation,@RequestParam String id_orden){
	        switch (operation){
	            case "terminada":{
	                Optional<Orden> option_orden=ordenService.listarId(Integer.parseInt(id_orden));

	                if(option_orden.isPresent()){
	                    Orden temp_orden=option_orden.get();
	                    temp_orden.setCocinada(true);

	                    ordenService.modificar(temp_orden);
	                }
	            }break;
	            case "pagada":{
	                Optional<Orden> option_orden=ordenService.listarId(Integer.parseInt(id_orden));

	                if(option_orden.isPresent()){
	                    Orden temp_orden=option_orden.get();
	                    temp_orden.setPagada(true);

	                    ordenService.modificar(temp_orden);
	                }
	            }break;
	        }
	        return "redirect:/cocinero";
	    }
}
