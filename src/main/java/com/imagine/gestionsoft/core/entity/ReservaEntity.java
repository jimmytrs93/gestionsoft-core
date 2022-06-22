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

	// bi-directional many-to-one association to Negocio
	@ManyToOne
	@JoinColumn(name = "negocio_id")
	private NegocioEntity negocio;

	// bi-directional many-to-one association to Item
	@ManyToOne
	@JoinColumn(name = "item_id")
	private ItemEntity item;

	// bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private ClienteEntity cliente;

	// bi-directional many-to-one association to Colaborador
	@ManyToOne
	@JoinColumn(name = "colaborador_id")
	private ColaboradorEntity colaborador;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

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

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public ClienteEntity getCliente() {
		return this.cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	public ColaboradorEntity getColaborador() {
		return this.colaborador;
	}

	public void setColaborador(ColaboradorEntity colaborador) {
		this.colaborador = colaborador;
	}

	public ItemEntity getItem() {
		return this.item;
	}

	public void setItem(ItemEntity item) {
		this.item = item;
	}

	public NegocioEntity getNegocio() {
		return this.negocio;
	}

	public void setNegocio(NegocioEntity negocio) {
		this.negocio = negocio;
	}

}