package gt.com.antiguarburguer.ASIIHT1.service;

import java.util.List;
import java.util.Optional;

public interface ICRUD <T> {
	T registrar(T t);
	T modificar(T t);
	void eliminar(int id );
	Optional<T> listarId(int id);
	List<T> listar();
}
