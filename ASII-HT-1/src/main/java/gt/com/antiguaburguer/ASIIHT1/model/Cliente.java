package gt.com.antiguaburguer.ASIIHT1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int IdCliente;
	@Column(name = "Nombre", nullable = false, length = 50, unique = false)
	private String Nombre;
	@Column(name = "Direccion", nullable = false, length = 50, unique = false)
	private String Direccion;
	@Column(name = "Nit", nullable = false, length = 50, unique = true)
	private String Nit;
	public int getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(int idCliente) {
		IdCliente = idCliente;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getNit() {
		return Nit;
	}
	public void setNit(String nit) {
		Nit = nit;
	}
}
