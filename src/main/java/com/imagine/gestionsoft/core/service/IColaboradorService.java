package com.imagine.gestionsoft.core.service;

import java.util.List;

import com.imagine.gestionsoft.core.dto.ColaboradorDto;

public interface IColaboradorService {

	public List<ColaboradorDto> obtenerColaboradoresNegocio(Integer negocioId);

	public ColaboradorDto obtenerColaborador(Integer colaboradorId);

	public ColaboradorDto crearColaborador(ColaboradorDto dto);

}
