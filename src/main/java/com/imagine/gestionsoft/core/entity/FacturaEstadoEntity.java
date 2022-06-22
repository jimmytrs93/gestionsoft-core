package com.imagine.gestionsoft.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the factura_estado database table.
 * 
 */
@Entity
@Table(name = "factura_estado")
public class FacturaEstadoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "factura_estado_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer facturaEstadoId;

	private String nombre;

	public FacturaEstadoEntity() {
	}

	public Integer getFacturaEstadoId() {
		return this.facturaEstadoId;
	}

	public void setFacturaEstadoId(Integer facturaEstadoId) {
		this.facturaEstadoId = facturaEstadoId;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}