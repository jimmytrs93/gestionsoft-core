package com.imagine.gestionsoft.core.service;

import java.util.List;

import com.imagine.gestionsoft.core.dto.NegocioDto;

public interface INegocioService {
	
	public NegocioDto obtenerNegocio(Integer id);
	
	public List<NegocioDto> obtenerNegocios();
	
	public NegocioDto crearNegocio(NegocioDto negocio);

}
