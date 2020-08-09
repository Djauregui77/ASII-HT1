package gt.com.antiguaburguer.ASIIHT1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gt.com.antiguaburguer.ASIIHT1.model.Cliente;
import gt.com.antiguarburguer.ASIIHT1.service.IClienteService;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired
	private IClienteService service;
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Cliente>> listar(){
		return new ResponseEntity<List<Cliente>>(service.listar(), HttpStatus.OK);
	}
}
