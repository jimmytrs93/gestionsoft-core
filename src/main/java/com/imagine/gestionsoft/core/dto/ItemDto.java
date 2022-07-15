package com.imagine.gestionsoft.core.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ItemDto {

	private Integer itemId;
	private Integer negocioId;
	private String codigo;
	private String nombre;
	private String descripcion;
	private Double valorVenta;
	private Double valorCompra;
	private Boolean estado;
	private Date fechaCreacion;
	private Date fechaInactivacion;
	private Boolean inventario;
	private Integer cantidad;
	private Double comisionColaborador;

	public ItemDto() {
	}

	public ItemDto(Integer itemId, Integer negocioId, String codigo, String nombre, String descripcion,
			Double valorVenta, Double valorCompra, Boolean estado, Date fechaCreacion, Date fechaInactivacion,
			Boolean inventario, Integer cantidad, Double comisionColaborador) {
		this.itemId = itemId;
		this.negocioId = negocioId;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.valorVenta = valorVenta;
		this.valorCompra = valorCompra;
		this.estado = estado;
		this.fechaCreacion = fechaCreacion;
		this.fechaInactivacion = fechaInactivacion;
		this.inventario = inventario;
		this.cantidad = cantidad;
		this.comisionColaborador = comisionColaborador;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getNegocioId() {
		return negocioId;
	}

	public void setNegocioId(Integer negocioId) {
		this.negocioId = negocioId;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getValorVenta() {
		return valorVenta;
	}

	public void setValorVenta(Double valorVenta) {
		this.valorVenta = valorVenta;
	}

	public Double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaInactivacion() {
		return fechaInactivacion;
	}

	public void setFechaInactivacion(Date fechaInactivacion) {
		this.fechaInactivacion = fechaInactivacion;
	}

	public Boolean getInventario() {
		return inventario;
	}

	public void setInventario(Boolean inventario) {
		this.inventario = inventario;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getComisionColaborador() {
		return comisionColaborador;
	}

	public void setComisionColaborador(Double comisionColaborador) {
		this.comisionColaborador = comisionColaborador;
	}

}
