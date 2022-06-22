package com.imagine.gestionsoft.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imagine.gestionsoft.core.dao.NegocioDao;
import com.imagine.gestionsoft.core.dto.NegocioDto;
import com.imagine.gestionsoft.core.service.INegocioService;

@Service
public class NegocioServiceImpl implements INegocioService {

	@Autowired
	private NegocioDao negocioDao;

	public NegocioDto obtenerNegocio(Integer id) {
		return negocioDao.findById(id);
	}

}
