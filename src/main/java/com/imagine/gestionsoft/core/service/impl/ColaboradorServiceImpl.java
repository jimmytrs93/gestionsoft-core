package com.imagine.gestionsoft.core.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imagine.gestionsoft.core.dao.ColaboradorDao;
import com.imagine.gestionsoft.core.dto.ColaboradorDto;
import com.imagine.gestionsoft.core.exception.GestionCampoException;
import com.imagine.gestionsoft.core.service.IColaboradorService;
import com.imagine.gestionsoft.core.service.INegocioService;

import static com.imagine.gestionsoft.core.constans.GestionConstantesRespuesta.*;

@Service
public class ColaboradorServiceImpl implements IColaboradorService {

	@Autowired
	private ColaboradorDao colaboradorDao;
	@Autowired
	private INegocioService negocioService;

	public List<ColaboradorDto> obtenerColaboradoresNegocio(Integer negocioId) {

		return colaboradorDao.findAllByNegocioId(negocioId);

	}

	public ColaboradorDto crearColaborador(ColaboradorDto dto) {
		negocioService.obtenerNegocio(dto.getNegocioId());
		ColaboradorDto dtoCon = colaboradorDao.findByDocumento(dto.getDocumento());

		if (dtoCon != null) {
			throw new GestionCampoException(COD_ERR_COLABORADOR_EXISTE, MSJ_ERR_COLABORADOR_EXISTE);
		}
		dto.setColaboradorId(null);
		dto.setFechaVinculacion(new Date());
		dto.setEstado(true);

		return colaboradorDao.save(dto);
	}

}
