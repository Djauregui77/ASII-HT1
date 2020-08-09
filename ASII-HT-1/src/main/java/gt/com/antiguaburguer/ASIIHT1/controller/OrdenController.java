package gt.com.antiguaburguer.ASIIHT1.controller;

import gt.com.antiguaburguer.ASIIHT1.model.Menu;
import gt.com.antiguaburguer.ASIIHT1.model.Orden;
import gt.com.antiguaburguer.ASIIHT1.service.impl.IProductosServiceImpl;
import gt.com.antiguaburguer.ASIIHT1.service.impl.MenuServiceImpl;
import gt.com.antiguaburguer.ASIIHT1.service.impl.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/ordenes")
public class OrdenController {
    @Autowired
    private OrdenService ordenService;

    @Autowired
    private MenuServiceImpl menuService;

    @Autowired
    private IProductosServiceImpl productosService;

    @PostMapping(value = "/crearOrden",headers = "Accept=application/json",consumes="application/json")
    public String crearOrden(@RequestBody List<Menu> payload, Model model){    
        Orden orden=new Orden();
        List<Menu> setMenus=new ArrayList<>();

        for (Menu item:
             payload) {
            Optional<Menu> menu= menuService.listarId(item.getIdMenu());
            if(menu.isPresent()){
                Menu rightMenu=menu.get();
                setMenus.add(rightMenu);
            }
        }
        orden.setFecha(new Date());
        orden.setMenus(setMenus);
        orden.setCocinada(false);
        orden.setPagada(false);

        ordenService.registrar(orden);

        return "redirect:/ordenes";
    }

    @RequestMapping(value = "/operationsOrden",method = RequestMethod.GET)
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
        return "redirect:/ordenes";
    }
    
    

    @GetMapping(value = "")
    public String index(Model model){
        model.addAttribute("menus",menuService.listar());
        model.addAttribute("ordenes",ordenService.listar());
        System.out.println(menuService.listar());
        return "Ordenes";
    }

}
