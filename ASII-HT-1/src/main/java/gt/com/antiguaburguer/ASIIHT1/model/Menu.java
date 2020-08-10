package gt.com.antiguaburguer.ASIIHT1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="menu")
public class Menu {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int IdMenu;
	@Column(name = "Descripcion", nullable = false, length = 50, unique = false)
	private String Descripcion;
	@Column(name = "Valor", nullable = false, length = 50, unique = false)
	private Float Valor;

	private String cantidad;

	public int getIdMenu() {
		return IdMenu;
	}
	public void setIdMenu(int idMenu) {
		IdMenu = idMenu;
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

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
}
