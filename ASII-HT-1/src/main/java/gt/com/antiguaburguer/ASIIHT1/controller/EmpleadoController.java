package gt.com.antiguaburguer.ASIIHT1.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import gt.com.antiguaburguer.ASIIHT1.model.Empleado;
import gt.com.antiguarburguer.ASIIHT1.service.IEmpleadoService;


@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

	@Autowired
	private IEmpleadoService service;
	
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Empleado>> listar(){
		return new ResponseEntity<List<Empleado>>(service.listar(), HttpStatus.OK);
	}
	
	/*//LISTAR POR ID
    @GetMapping(value = "/{id}", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Empleado> listarPorId(@PathVariable("id") Integer id){
        Optional<Empleado> bod = service.listarId(id);
        
        if(bod.isPresent()) {
            //throw new ModeloNotFoundException("Id no encontrado:" + id);
        }
        return new ResponseEntity<Empleado>(bod,HttpStatus.OK);
        //return service.listarId(id);
    }
    
    
    //REGISTRAR
    @PostMapping(produces = "application/json", consumes = "application/json")
    public ResponseEntity<Object> registrar(@Valid @RequestBody Empleado emp) {
        Empleado empleado = new Empleado();
        empleado = service.registrar(emp);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(empleado.getIdEmpleado()).toUri();
        return ResponseEntity.created(location).build();
        
    }
    
    //MODIFICAR
        @PutMapping(value="/{id}", produces = "application/json", consumes = "application/json")
        public ResponseEntity<Object> modificar(@Valid @RequestBody Empleado empleado) {
            service.modificar(empleado);
            return new ResponseEntity<Object>(HttpStatus.OK);
            
        }
        
        
        //ELIMINAR
        @DeleteMapping(value = "/{id}")
        public void eliminar(@PathVariable("id") Integer id) {
            Empleado bod = service.listarId(id);
            if(bod == null) {
                //throw new ModeloNotFoundException("id no encontrado: " + id);
            }else {
                service.eliminar(id);
            }
            //service.eliminar(id);
        }*/
}
