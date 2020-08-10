package gt.com.antiguaburguer.ASIIHT1.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="ordenes")
public class Orden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOrden;

	@Column(name = "fecha", nullable = false)
	private Date fecha;

	@Column(name = "cocinada", nullable = false)
	private boolean cocinada;

	@Column(name = "pagada", nullable = false)
	private boolean pagada;
	@OneToMany
	private List<Menu> menus;

	public int getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(int idOrden) {
		this.idOrden = idOrden;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public boolean isCocinada() {
		return cocinada;
	}

	public void setCocinada(boolean cocinada) {
		this.cocinada = cocinada;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}
	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

}
