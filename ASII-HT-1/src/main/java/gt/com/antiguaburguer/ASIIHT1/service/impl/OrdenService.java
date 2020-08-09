package gt.com.antiguaburguer.ASIIHT1.service.impl;

import gt.com.antiguaburguer.ASIIHT1.dao.IOrdenDAO;
import gt.com.antiguaburguer.ASIIHT1.model.Orden;
import gt.com.antiguarburguer.ASIIHT1.service.IOrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdenService implements IOrdenService {
    @Autowired
    private IOrdenDAO ordenDAO;

    @Override
    public Orden registrar(Orden orden) {
        return ordenDAO.save(orden);
    }

    @Override
    public Orden modificar(Orden orden) {
        return ordenDAO.save(orden);
    }

    @Override
    public void eliminar(int id) {
        ordenDAO.deleteById(id);
    }

    @Override
    public Optional<Orden> listarId(int id) {
        return ordenDAO.findById(id);
    }

    @Override
    public List<Orden> listar() {
        return ordenDAO.findAll();
    }
}
