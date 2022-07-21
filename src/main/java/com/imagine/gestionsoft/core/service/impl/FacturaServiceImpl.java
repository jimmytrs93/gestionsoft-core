package com.imagine.gestionsoft.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.imagine.gestionsoft.core.dao.FacturaDao;
import com.imagine.gestionsoft.core.dto.FacturaDto;
import com.imagine.gestionsoft.core.service.IClienteService;
import com.imagine.gestionsoft.core.service.IFacturaService;
import com.imagine.gestionsoft.core.service.INegocioService;

public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private FacturaDao facturaDao;
	@Autowired
	private INegocioService negocioService;
	@Autowired
	private IClienteService clienteService;

	@Override
	public List<FacturaDto> consultarFacturasNegocio(Integer negocio) {
		negocioService.obtenerNegocio(negocio);
		return facturaDao.findAllByNegocioId(negocio);
	}

	@Override
	public FacturaDto consultarFactura(Integer factura, Integer negocio) {
		negocioService.obtenerNegocio(negocio);
		return facturaDao.findByFacturaIdAndNegocioId(factura, negocio);
	}

	public FacturaDto crearFactura(FacturaDto dto) {
		clienteService.obtenerClienteNegocio(dto.getClienteId(), dto.getNegocioId());
		dto.setFacturaId(null);
		return facturaDao.save(dto);
	}

}
