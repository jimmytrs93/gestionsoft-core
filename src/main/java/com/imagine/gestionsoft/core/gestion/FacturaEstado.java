package gestion;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the factura_estado database table.
 * 
 */
@Entity
@Table(name="factura_estado")
@NamedQuery(name="FacturaEstado.findAll", query="SELECT f FROM FacturaEstado f")
public class FacturaEstado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="factura_estado_id")
	private int facturaEstadoId;

	private String nombre;

	//bi-directional many-to-one association to Factura
	@OneToMany(mappedBy="facturaEstado")
	private List<Factura> facturas;

	public FacturaEstado() {
	}

	public int getFacturaEstadoId() {
		return this.facturaEstadoId;
	}

	public void setFacturaEstadoId(int facturaEstadoId) {
		this.facturaEstadoId = facturaEstadoId;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Factura> getFacturas() {
		return this.facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	public Factura addFactura(Factura factura) {
		getFacturas().add(factura);
		factura.setFacturaEstado(this);

		return factura;
	}

	public Factura removeFactura(Factura factura) {
		getFacturas().remove(factura);
		factura.setFacturaEstado(null);

		return factura;
	}

}