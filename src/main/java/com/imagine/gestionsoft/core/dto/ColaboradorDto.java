package com.imagine.gestionsoft.core.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ColaboradorDto {

	private Integer colaboradorId;
	private Integer negocioId;
	private String nombre;
	private String documento;
	private String telefono;
	private String email;
	private String cargo;
	private Date fechaVinculacion;
	private Boolean estado;
	private Date fechaDesvinculacion;

	public ColaboradorDto() {
	}

	public ColaboradorDto(Integer colaboradorId, Integer negocioId, String nombre, String documento, String telefono,
			String email, String cargo, Date fechaVinculacion, Boolean estado, Date fechaDesvinculacion) {
		this.colaboradorId = colaboradorId;
		this.negocioId = negocioId;
		this.nombre = nombre;
		this.documento = documento;
		this.telefono = telefono;
		this.email = email;
		this.cargo = cargo;
		this.fechaVinculacion = fechaVinculacion;
		this.estado = estado;
		this.fechaDesvinculacion = fechaDesvinculacion;
	}

	public Integer getColaboradorId() {
		return colaboradorId;
	}

	public void setColaboradorId(Integer colaboradorId) {
		this.colaboradorId = colaboradorId;
	}

	public Integer getNegocioId() {
		return negocioId;
	}

	public void setNegocioId(Integer negocioId) {
		this.negocioId = negocioId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Date getFechaVinculacion() {
		return fechaVinculacion;
	}

	public void setFechaVinculacion(Date fechaVinculacion) {
		this.fechaVinculacion = fechaVinculacion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Date getFechaDesvinculacion() {
		return fechaDesvinculacion;
	}

	public void setFechaDesvinculacion(Date fechaDesvinculacion) {
		this.fechaDesvinculacion = fechaDesvinculacion;
	}
}
