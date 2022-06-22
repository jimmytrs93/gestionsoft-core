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
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@Table(name = "cliente")
public class ClienteEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cliente_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer clienteId;

	// bi-directional many-to-one association to Negocio
	@ManyToOne
	@JoinColumn(name = "negocio_id")
	private NegocioEntity negocio;

	private String nombre;

	private String telefono;

	private String email;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nacimeinto")
	private Date fechaNacimeinto;

	private String genero;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_registro")
	private Date fechaRegistro;

	@Column(name = "autoriza_notificaciones")
	private Boolean autorizaNotificaciones;

	private Boolean estado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_inactivacion")
	private Date fechaInactivacion;

	public ClienteEntity() {
	}

	public Integer getClienteId() {
		return this.clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

	public Boolean getAutorizaNotificaciones() {
		return this.autorizaNotificaciones;
	}

	public void setAutorizaNotificaciones(Boolean autorizaNotificaciones) {
		this.autorizaNotificaciones = autorizaNotificaciones;
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

	public Date getFechaInactivacion() {
		return this.fechaInactivacion;
	}

	public void setFechaInactivacion(Date fechaInactivacion) {
		this.fechaInactivacion = fechaInactivacion;
	}

	public Date getFechaNacimeinto() {
		return this.fechaNacimeinto;
	}

	public void setFechaNacimeinto(Date fechaNacimeinto) {
		this.fechaNacimeinto = fechaNacimeinto;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
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

	public NegocioEntity getNegocio() {
		return this.negocio;
	}

	public void setNegocio(NegocioEntity negocio) {
		this.negocio = negocio;
	}

}