package com.imagine.gestionsoft.core.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ClienteDto {

	private Integer clienteId;
	private Integer negocioId;
	private String documento;
	private String nombre;
	private String telefono;
	private String email;
	private Date fechaNacimeinto;
	private String genero;
	private Date fechaRegistro;
	private Boolean autorizaNotificaciones;
	private Boolean estado;
	private Date fechaInactivacion;

	public ClienteDto() {
	}

	public ClienteDto(Integer clienteId, Integer negocioId, String documento, String nombre, String telefono,
			String email, Date fechaNacimeinto, String genero, Date fechaRegistro, Boolean autorizaNotificaciones,
			Boolean estado, Date fechaInactivacion) {
		this.clienteId = clienteId;
		this.negocioId = negocioId;
		this.documento = documento;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.fechaNacimeinto = fechaNacimeinto;
		this.genero = genero;
		this.fechaRegistro = fechaRegistro;
		this.autorizaNotificaciones = autorizaNotificaciones;
		this.estado = estado;
		this.fechaInactivacion = fechaInactivacion;
	}

	public Integer getClienteId() {
		return clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

	public Integer getNegocioId() {
		return negocioId;
	}

	public void setNegocioId(Integer negocioId) {
		this.negocioId = negocioId;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public Date getFechaNacimeinto() {
		return fechaNacimeinto;
	}

	public void setFechaNacimeinto(Date fechaNacimeinto) {
		this.fechaNacimeinto = fechaNacimeinto;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Boolean getAutorizaNotificaciones() {
		return autorizaNotificaciones;
	}

	public void setAutorizaNotificaciones(Boolean autorizaNotificaciones) {
		this.autorizaNotificaciones = autorizaNotificaciones;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Date getFechaInactivacion() {
		return fechaInactivacion;
	}

	public void setFechaInactivacion(Date fechaInactivacion) {
		this.fechaInactivacion = fechaInactivacion;
	}
}
