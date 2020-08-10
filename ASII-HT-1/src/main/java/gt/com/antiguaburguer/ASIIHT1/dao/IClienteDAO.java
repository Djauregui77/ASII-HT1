package gt.com.antiguaburguer.ASIIHT1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import gt.com.antiguaburguer.ASIIHT1.model.Cliente;

public interface IClienteDAO extends JpaRepository<Cliente, Integer>{

}
