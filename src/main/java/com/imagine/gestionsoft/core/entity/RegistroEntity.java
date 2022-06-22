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
 * The persistent class for the registro database table.
 * 
 */
@Entity
@Table(name = "registro")
public class RegistroEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "registro_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer registroId;

	// bi-directional many-to-one association to Factura
	@ManyToOne
	@JoinColumn(name = "factura_id")
	private FacturaEntity factura;

	// bi-directional many-to-one association to Item
	@ManyToOne
	@JoinColumn(name = "item_id")
	private ItemEntity item;

	// bi-directional many-to-one association to Colaborador
	@ManyToOne
	@JoinColumn(name = "colaborador_id")
	private ColaboradorEntity colaborador;

	@Column(name = "comision_colaborador")
	private Double comisionColaborador;

	private Integer cantidad;

	@Column(name = "valor_venta")
	private Double valorVenta;

	private Boolean estado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_registro")
	private Date fechaRegistro;

	public RegistroEntity() {
	}

	public Integer getRegistroId() {
		return this.registroId;
	}

	public void setRegistroId(Integer registroId) {
		this.registroId = registroId;
	}

	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getComisionColaborador() {
		return this.comisionColaborador;
	}

	public void setComisionColaborador(Double comisionColaborador) {
		this.comisionColaborador = comisionColaborador;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
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

	public Double getValorVenta() {
		return this.valorVenta;
	}

	public void setValorVenta(Double valorVenta) {
		this.valorVenta = valorVenta;
	}

	public ColaboradorEntity getColaborador() {
		return this.colaborador;
	}

	public void setColaborador(ColaboradorEntity colaborador) {
		this.colaborador = colaborador;
	}

	public FacturaEntity getFactura() {
		return this.factura;
	}

	public void setFactura(FacturaEntity factura) {
		this.factura = factura;
	}

	public ItemEntity getItem() {
		return this.item;
	}

	public void setItem(ItemEntity item) {
		this.item = item;
	}

}