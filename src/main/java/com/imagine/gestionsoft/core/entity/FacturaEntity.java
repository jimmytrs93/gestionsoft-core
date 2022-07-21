package com.imagine.gestionsoft.core.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	@Column(name = "negocio_id")
	private Integer negocioId;

	@Column(name = "cliente_id")
	private Integer clienteId;

	@Column(name = "estado_factura_id")
	private Integer facturaEstado;

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
		return facturaId;
	}

	public void setFacturaId(Integer facturaId) {
		this.facturaId = facturaId;
	}

	public Integer getNegocioId() {
		return negocioId;
	}

	public void setNegocioId(Integer negocioId) {
		this.negocioId = negocioId;
	}

	public Integer getClienteId() {
		return clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

	public Integer getFacturaEstado() {
		return facturaEstado;
	}

	public void setFacturaEstado(Integer facturaEstado) {
		this.facturaEstado = facturaEstado;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}