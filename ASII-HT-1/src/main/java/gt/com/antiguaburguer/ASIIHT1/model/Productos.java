package gt.com.antiguaburguer.ASIIHT1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="productos")
public class Productos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int IdProducto;
	@Column(name = "Descripcion", nullable = false, length = 50, unique = true)
	private String Descripcion;
	@Column(name = "Valor", nullable = false, length = 50, unique = false)
	private Float Valor;
	public int getIdProducto() {
		return IdProducto;
	}
	public void setIdProducto(int idProducto) {
		IdProducto = idProducto;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public Float getValor() {
		return Valor;
	}
	public void setValor(Float valor) {
		Valor = valor;
	}
}
