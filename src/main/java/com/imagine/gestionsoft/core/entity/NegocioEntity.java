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
 * The persistent class for the negocio database table.
 * 
 */
@Entity
@Table(name = "negocio")
public class NegocioEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "negocio_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer negocioId;

	private String nombre;

	private String documento;

	private String representante;

	@Column(name = "contacto_autorizado")
	private String contactoAutorizado;

	private String telefono;

	private String email;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;

	private Boolean estado;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_inactivacion")
	private Date fechaInactivacion;

	private String imagen;

	private String observacion;

	public NegocioEntity() {
	}

	public Integer getNegocioId() {
		return this.negocioId;
	}

	public void setNegocioId(Integer negocioId) {
		this.negocioId = negocioId;
	}

	public String getContactoAutorizado() {
		return this.contactoAutorizado;
	}

	public void setContactoAutorizado(String contactoAutorizado) {
		this.contactoAutorizado = contactoAutorizado;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
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

	public Date getFechaInactivacion() {
		return this.fechaInactivacion;
	}

	public void setFechaInactivacion(Date fechaInactivacion) {
		this.fechaInactivacion = fechaInactivacion;
	}

	public String getImagen() {
		return this.imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getRepresentante() {
		return this.representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}