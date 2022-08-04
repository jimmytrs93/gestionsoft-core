package com.imagine.gestionsoft.core.dto;

import java.util.Date;

public class ReservaCriterialDto {
	
	private Integer negocioId;
	private Integer itemId;
	private Integer clienteId;
	private Integer colaboradorId;
	private Date fechaIni;
	private Date fechaFin;
	private Date fechaCreacionIni;
	private Date fechaCreacionFin;
	private Boolean estado;
	private Boolean efectiva;
	private String observacion;
	
	public ReservaCriterialDto() {
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

	public Date getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(Date fechaIni) {
		this.fechaIni = fechaIni;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaCreacionIni() {
		return fechaCreacionIni;
	}

	public void setFechaCreacionIni(Date fechaCreacionIni) {
		this.fechaCreacionIni = fechaCreacionIni;
	}

	public Date getFechaCreacionFin() {
		return fechaCreacionFin;
	}

	public void setFechaCreacionFin(Date fechaCreacionFin) {
		this.fechaCreacionFin = fechaCreacionFin;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Boolean getEfectiva() {
		return efectiva;
	}

	public void setEfectiva(Boolean efectiva) {
		this.efectiva = efectiva;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

}
