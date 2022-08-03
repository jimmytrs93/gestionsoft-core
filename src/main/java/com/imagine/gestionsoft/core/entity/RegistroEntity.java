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

	@Column(name = "factura_id")
	private Integer facturaId;

	@Column(name = "item_id")
	private Integer itemId;

	@Column(name = "colaborador_id")
	private Integer colaboradorId;

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
		return registroId;
	}

	public void setRegistroId(Integer registroId) {
		this.registroId = registroId;
	}

	public Integer getFacturaId() {
		return facturaId;
	}

	public void setFacturaId(Integer facturaId) {
		this.facturaId = facturaId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getColaboradorId() {
		return colaboradorId;
	}

	public void setColaboradorId(Integer colaboradorId) {
		this.colaboradorId = colaboradorId;
	}

	public Double getComisionColaborador() {
		return comisionColaborador;
	}

	public void setComisionColaborador(Double comisionColaborador) {
		this.comisionColaborador = comisionColaborador;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getValorVenta() {
		return valorVenta;
	}

	public void setValorVenta(Double valorVenta) {
		this.valorVenta = valorVenta;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
}