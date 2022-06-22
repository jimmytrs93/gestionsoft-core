package com.imagine.gestionsoft.core.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the factura database table.
 * 
 */
@Entity
@Table(name = "factura")
public class FacturaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "factura_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer facturaId;

	// bi-directional many-to-one association to Negocio
	@ManyToOne
	@JoinColumn(name = "negocio_id")
	private NegocioEntity negocio;

	// bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private ClienteEntity cliente;

	// bi-directional many-to-one association to FacturaEstado
	@ManyToOne
	@JoinColumn(name = "estado_factura_id")
	private FacturaEstadoEntity facturaEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;

	@Column(name = "metodo_pago")
	private String metodoPago;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;

	public FacturaEntity() {
	}

	public Integer getFacturaId() {
		return this.facturaId;
	}

	public void setFacturaId(Integer facturaId) {
		this.facturaId = facturaId;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getMetodoPago() {
		return this.metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public ClienteEntity getCliente() {
		return this.cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	public FacturaEstadoEntity getFacturaEstado() {
		return this.facturaEstado;
	}

	public void setFacturaEstado(FacturaEstadoEntity facturaEstado) {
		this.facturaEstado = facturaEstado;
	}

	public NegocioEntity getNegocio() {
		return this.negocio;
	}

	public void setNegocio(NegocioEntity negocio) {
		this.negocio = negocio;
	}

}