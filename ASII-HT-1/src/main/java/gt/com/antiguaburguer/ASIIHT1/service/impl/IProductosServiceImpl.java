package gt.com.antiguaburguer.ASIIHT1.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gt.com.antiguaburguer.ASIIHT1.dao.IProductosDAO;
import gt.com.antiguaburguer.ASIIHT1.model.Productos;
import gt.com.antiguarburguer.ASIIHT1.service.IProductosService;
@Service
public class IProductosServiceImpl implements IProductosService{
	@Autowired
	private IProductosDAO dao;
	
	
	@Override
	public Productos registrar(Productos t) {
		return dao.save(t);
	}

	@Override
	public Productos modificar(Productos t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);
	}

	@Override
	public Optional<Productos> listarId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Productos> listar() {
		return dao.findAll();
	}
}
