package com.imagine.gestionsoft.core.entity;

import java.io.Serializable;
import java.sql.Timestamp;
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
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@Table(name = "usuario")
public class UsuarioEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "usuario_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer usuarioId;

	// bi-directional many-to-one association to Negocio
	@ManyToOne
	@JoinColumn(name = "negocio_id")
	private NegocioEntity negocio;

	private String nombre;

	private String contrasena;

	private String email;

	private String telefono;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;

	private Boolean estado;

	@Column(name = "fecha_inactivacion")
	private Timestamp fechaInactivacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ultimo_login")
	private Date ultimoLogin;

	@Column(name = "cambio_contrasena")
	private Boolean cambioContrasena;

	public UsuarioEntity() {
	}

	public Integer getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Boolean getCambioContrasena() {
		return this.cambioContrasena;
	}

	public void setCambioContrasena(Boolean cambioContrasena) {
		this.cambioContrasena = cambioContrasena;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Timestamp getFechaInactivacion() {
		return this.fechaInactivacion;
	}

	public void setFechaInactivacion(Timestamp fechaInactivacion) {
		this.fechaInactivacion = fechaInactivacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getUltimoLogin() {
		return this.ultimoLogin;
	}

	public void setUltimoLogin(Date ultimoLogin) {
		this.ultimoLogin = ultimoLogin;
	}

	public NegocioEntity getNegocio() {
		return this.negocio;
	}

	public void setNegocio(NegocioEntity negocio) {
		this.negocio = negocio;
	}

}