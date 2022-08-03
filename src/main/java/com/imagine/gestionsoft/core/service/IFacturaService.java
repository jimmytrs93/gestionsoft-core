package com.imagine.gestionsoft.core.service;

import java.util.List;

import com.imagine.gestionsoft.core.dto.FacturaDto;

public interface IFacturaService {

	public List<FacturaDto> consultarFacturasNegocio(Integer negocio);

	public FacturaDto consultarFactura(Integer factura, Integer negocio);
	
	public FacturaDto consultarFacturaEstado(Integer factura, Integer estado);
	
	public FacturaDto crearFactura(FacturaDto dto);

}
