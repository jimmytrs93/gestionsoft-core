package com.imagine.gestionsoft.core.dto;

import java.util.Date;

public class RegistroDto {

	private Integer registroId;
	private Integer facturaId;
	private Integer itemId;
	private Integer colaboradorId;
	private Double comisionColaborador;
	private Integer cantidad;
	private Double valorVenta;
	private Boolean estado;
	private Date fechaModificacion;
	private Date fechaRegistro;

	public RegistroDto() {
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
