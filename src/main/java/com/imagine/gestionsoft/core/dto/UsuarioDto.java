package com.imagine.gestionsoft.core.dto;

import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class UsuarioDto {

	private Integer usuarioId;
	private Integer negocioId;
	private String documento;
	private String nombre;
	private String contrasena;
	private String email;
	private String telefono;
	private Date fechaCreacion;
	private Boolean estado;
	private Timestamp fechaInactivacion;
	private Date ultimoLogin;
	private Boolean cambioContrasena;

	public UsuarioDto() {
	}

	public UsuarioDto(Integer usuarioId, Integer negocioId, String documento, String nombre, String contrasena,
			String email, String telefono, Date fechaCreacion, Boolean estado, Timestamp fechaInactivacion,
			Date ultimoLogin, Boolean cambioContrasena) {
		this.usuarioId = usuarioId;
		this.negocioId = negocioId;
		this.documento = documento;
		this.nombre = nombre;
		this.contrasena = contrasena;
		this.email = email;
		this.telefono = telefono;
		this.fechaCreacion = fechaCreacion;
		this.estado = estado;
		this.fechaInactivacion = fechaInactivacion;
		this.ultimoLogin = ultimoLogin;
		this.cambioContrasena = cambioContrasena;
	}

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
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

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Timestamp getFechaInactivacion() {
		return fechaInactivacion;
	}

	public void setFechaInactivacion(Timestamp fechaInactivacion) {
		this.fechaInactivacion = fechaInactivacion;
	}

	public Date getUltimoLogin() {
		return ultimoLogin;
	}

	public void setUltimoLogin(Date ultimoLogin) {
		this.ultimoLogin = ultimoLogin;
	}

	public Boolean getCambioContrasena() {
		return cambioContrasena;
	}

	public void setCambioContrasena(Boolean cambioContrasena) {
		this.cambioContrasena = cambioContrasena;
	}

}
