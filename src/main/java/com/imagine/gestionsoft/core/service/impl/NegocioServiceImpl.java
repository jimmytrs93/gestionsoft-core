package com.imagine.gestionsoft.core.service.impl;

import static com.imagine.gestionsoft.core.constans.GestionConstantesRespuesta.*;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imagine.gestionsoft.core.dao.NegocioDao;
import com.imagine.gestionsoft.core.dto.NegocioDto;
import com.imagine.gestionsoft.core.exception.GestionCampoException;
import com.imagine.gestionsoft.core.service.INegocioService;

@Service
public class NegocioServiceImpl implements INegocioService {

	@Autowired
	private NegocioDao negocioDao;

	public NegocioDto obtenerNegocio(Integer id) {

		NegocioDto negocioDto = negocioDao.findById(id);

		if (negocioDto == null) {
			throw new GestionCampoException(COD_ERR_NEGOCIO_NO_EXISTE, MSJ_ERR_NEGOCIO_NO_EXISTE);
		}

		return negocioDto;
	}

	public List<NegocioDto> obtenerNegocios() {
		return negocioDao.findAll();
	}

	public NegocioDto crearNegocio(NegocioDto negocio) {
		List<NegocioDto> negocioList = negocioDao.findAllByDocumentoOrEmail(negocio.getDocumento(), negocio.getEmail());

		if (negocioList == null || negocioList.size() == 0) {
			return negocioDao.save(negocio);
		}
		
		negocio.setNegocioId(null);
		negocio.setFechaCreacion(new Date());
		negocio.setEstado(true);

		throw new GestionCampoException(COD_ERR_NEGOCIO_DOC_EMAIL_EXISTE, MSJ_ERR_NEGOCIO_DOC_EMAIL_EXISTE);

	}

}
