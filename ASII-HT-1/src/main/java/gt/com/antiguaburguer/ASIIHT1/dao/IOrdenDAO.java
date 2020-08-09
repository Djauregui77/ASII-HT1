package gt.com.antiguaburguer.ASIIHT1.dao;

import gt.com.antiguaburguer.ASIIHT1.model.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrdenDAO extends JpaRepository<Orden,Integer> {
    
}
