package com.imagine.gestionsoft.core.service.impl;

import static com.imagine.gestionsoft.core.constans.GestionConstantesRespuesta.COD_ERR_REG_FACT_NO_EXISTE;
import static com.imagine.gestionsoft.core.constans.GestionConstantesRespuesta.MSJ_ERR_REG_FACT_NO_EXISTE;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.imagine.gestionsoft.core.dao.RegistroDao;
import com.imagine.gestionsoft.core.dto.RegistroDto;
import com.imagine.gestionsoft.core.exception.GestionCampoException;
import com.imagine.gestionsoft.core.service.IFacturaService;
import com.imagine.gestionsoft.core.service.IRegistroService;

public class RegistroServiceImpl implements IRegistroService {

	@Autowired
	private RegistroDao registroDao;
	@Autowired
	private IFacturaService facturaService;

	@Override
	public List<RegistroDto> guardarRegistros(List<RegistroDto> dtos, Integer factura) {
		facturaService.consultarFacturaEstado(factura, 1);

		for (RegistroDto registroDto : dtos) {
			registroDto.setRegistroId(null);
			registroDto.setFacturaId(factura);
		}
		return registroDao.saveAll(dtos);
	}

	@Override
	public RegistroDto guardarRegistro(RegistroDto dto) {
		facturaService.consultarFacturaEstado(dto.getFacturaId(), 1);

		dto.setRegistroId(null);
		dto.setFechaRegistro(new Date());
		dto.setEstado(true);

		return registroDao.save(dto);
	}

	@Override
	public List<RegistroDto> obtenerRegistrosFactura(Integer facturaId, Integer negocio) {
		facturaService.consultarFactura(facturaId, negocio);
		return registroDao.findAllByFacturaId(facturaId);
	}

	@Override
	public RegistroDto editarRegistro(RegistroDto dto) {
		facturaService.consultarFacturaEstado(dto.getFacturaId(), 1);

		RegistroDto registroDto = registroDao.findByRegistroIdAndFacturaId(dto.getRegistroId(), dto.getFacturaId());

		if (registroDto == null) {
			throw new GestionCampoException(COD_ERR_REG_FACT_NO_EXISTE, MSJ_ERR_REG_FACT_NO_EXISTE);
		}

		dto.setFechaModificacion(new Date());

		return registroDao.save(dto);
	}

}
