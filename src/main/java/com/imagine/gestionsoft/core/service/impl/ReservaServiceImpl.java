package com.imagine.gestionsoft.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imagine.gestionsoft.core.dao.ReservaDao;
import com.imagine.gestionsoft.core.dto.ReservaCriterialDto;
import com.imagine.gestionsoft.core.dto.ReservaDto;
import com.imagine.gestionsoft.core.exception.GestionCampoException;
import com.imagine.gestionsoft.core.service.INegocioService;
import com.imagine.gestionsoft.core.service.IReservaService;

@Service
public class ReservaServiceImpl implements IReservaService {

	@Autowired
	private ReservaDao reservaDao;
	@Autowired
	private INegocioService negocioService;

	public ReservaDto crearReserva(ReservaDto dto) {

		negocioService.obtenerNegocio(dto.getNegocioId());

		List<ReservaDto> dtos = reservaDao.findAllByNegocioIdAndClienteIdAndEstado(dto.getNegocioId(),
				dto.getClienteId(), true);
		if (dtos.size() > 0) {
			throw new GestionCampoException(null, null);
		}

		dto.setReservaId(null);
		dto.setEstado(true);
		return reservaDao.save(dto);
	}

	public ReservaDto actualizarReserva(ReservaDto dto) {
		negocioService.obtenerNegocio(dto.getNegocioId());
		ReservaDto reservaDto = reservaDao.findByReservaId(dto.getReservaId());

		if (reservaDto == null) {
			throw new GestionCampoException(null, null);
		}

		return reservaDao.save(dto);
	}

	public List<ReservaDto> obtenerReservasCriterios(ReservaCriterialDto criterialDto) {
		negocioService.obtenerNegocio(criterialDto.getNegocioId());
		return reservaDao.findCriterial(criterialDto);

	}

}
