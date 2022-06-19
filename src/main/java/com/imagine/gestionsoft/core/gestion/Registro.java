package gestion;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the registro database table.
 * 
 */
@Entity
@Table(name="registro")
@NamedQuery(name="Registro.findAll", query="SELECT r FROM Registro r")
public class Registro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="registro_id")
	private int registroId;

	private int cantidad;

	@Column(name="comision_colaborador")
	private double comisionColaborador;

	private byte estado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_modificacion")
	private Date fechaModificacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_registro")
	private Date fechaRegistro;

	@Column(name="valor_venta")
	private double valorVenta;

	//bi-directional many-to-one association to Colaborador
	@ManyToOne
	@JoinColumn(name="colaborador_id")
	private Colaborador colaborador;

	//bi-directional many-to-one association to Factura
	@ManyToOne
	@JoinColumn(name="factura_id")
	private Factura factura;

	//bi-directional many-to-one association to Item
	@ManyToOne
	@JoinColumn(name="item_id")
	private Item item;

	public Registro() {
	}

	public int getRegistroId() {
		return this.registroId;
	}

	public void setRegistroId(int registroId) {
		this.registroId = registroId;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getComisionColaborador() {
		return this.comisionColaborador;
	}

	public void setComisionColaborador(double comisionColaborador) {
		this.comisionColaborador = comisionColaborador;
	}

	public byte getEstado() {
		return this.estado;
	}

	public void setEstado(byte estado) {
		this.estado = estado;
	}

	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public double getValorVenta() {
		return this.valorVenta;
	}

	public void setValorVenta(double valorVenta) {
		this.valorVenta = valorVenta;
	}

	public Colaborador getColaborador() {
		return this.colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public Factura getFactura() {
		return this.factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}