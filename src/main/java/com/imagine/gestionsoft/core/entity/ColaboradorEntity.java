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
 * The persistent class for the colaborador database table.
 * 
 */
@Entity
@Table(name = "colaborador")
public class ColaboradorEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "colaborador_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer colaboradorId;

	// bi-directional many-to-one association to Negocio
	@ManyToOne
	@JoinColumn(name = "negocio_id")
	private NegocioEntity negocio;

	private String nombre;

	private String documento;

	private String telefono;

	private String email;

	private String cargo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_vinculacion")
	private Date fechaVinculacion;

	private Boolean estado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_desvinculacion")
	private Date fechaDesvinculacion;

	public ColaboradorEntity() {
	}

	public Integer getColaboradorId() {
		return this.colaboradorId;
	}

	public void setColaboradorId(Integer colaboradorId) {
		this.colaboradorId = colaboradorId;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
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

	public Date getFechaDesvinculacion() {
		return this.fechaDesvinculacion;
	}

	public void setFechaDesvinculacion(Date fechaDesvinculacion) {
		this.fechaDesvinculacion = fechaDesvinculacion;
	}

	public Date getFechaVinculacion() {
		return this.fechaVinculacion;
	}

	public void setFechaVinculacion(Date fechaVinculacion) {
		this.fechaVinculacion = fechaVinculacion;
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