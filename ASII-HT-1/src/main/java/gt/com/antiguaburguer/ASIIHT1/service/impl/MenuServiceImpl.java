package gt.com.antiguaburguer.ASIIHT1.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gt.com.antiguaburguer.ASIIHT1.dao.IMenuDAO;
import gt.com.antiguaburguer.ASIIHT1.model.Menu;
import gt.com.antiguarburguer.ASIIHT1.service.IMenuService;
@Service
public class MenuServiceImpl implements IMenuService{
	@Autowired
	private IMenuDAO dao;
	
	
	@Override
	public Menu registrar(Menu t) {
		return dao.save(t);
	}

	@Override
	public Menu modificar(Menu t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);
	}

	@Override
	public Optional<Menu> listarId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Menu> listar() {
		return dao.findAll();
	}
}
