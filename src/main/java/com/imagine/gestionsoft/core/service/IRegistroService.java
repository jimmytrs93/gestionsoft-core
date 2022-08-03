package com.imagine.gestionsoft.core.service;

import java.util.List;

import com.imagine.gestionsoft.core.dto.RegistroDto;

public interface IRegistroService {

	public List<RegistroDto> guardarRegistros(List<RegistroDto> dtos, Integer factura);

	public RegistroDto guardarRegistro(RegistroDto dto);

	public RegistroDto editarRegistro(RegistroDto dto);

	public List<RegistroDto> obtenerRegistrosFactura(Integer facturaId, Integer negocio);

}
