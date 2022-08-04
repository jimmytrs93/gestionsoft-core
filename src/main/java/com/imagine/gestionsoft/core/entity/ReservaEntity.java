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
 * The persistent class for the reserva database table.
 * 
 */
@Entity
@Table(name = "reserva")
public class ReservaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "reserva_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reservaId;

	@Column(name = "negocio_id")
	private Integer negocioId;

	@Column(name = "item_id")
	private Integer itemId;

	@Column(name = "cliente_id")
	private Integer clienteId;

	@Column(name = "colaborador_id")
	private Integer colaboradorId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;

	private Boolean estado;

	private Boolean efectiva;

	private String observacion;

	public ReservaEntity() {
	}

	public Integer getReservaId() {
		return this.reservaId;
	}

	public void setReservaId(Integer reservaId) {
		this.reservaId = reservaId;
	}

	public Boolean getEfectiva() {
		return this.efectiva;
	}

	public void setEfectiva(Boolean efectiva) {
		this.efectiva = efectiva;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Integer getNegocioId() {
		return negocioId;
	}

	public void setNegocioId(Integer negocioId) {
		this.negocioId = negocioId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getClienteId() {
		return clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

	public Integer getColaboradorId() {
		return colaboradorId;
	}

	public void setColaboradorId(Integer colaboradorId) {
		this.colaboradorId = colaboradorId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}