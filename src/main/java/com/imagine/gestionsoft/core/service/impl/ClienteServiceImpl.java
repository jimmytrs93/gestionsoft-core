package com.imagine.gestionsoft.core.service.impl;

import static com.imagine.gestionsoft.core.constans.GestionConstantesRespuesta.COD_ERR_CLIENTE_EXISTE;
import static com.imagine.gestionsoft.core.constans.GestionConstantesRespuesta.MSJ_ERR_CLIENTE_EXISTE;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imagine.gestionsoft.core.dao.ClienteDao;
import com.imagine.gestionsoft.core.dto.ClienteDto;
import com.imagine.gestionsoft.core.exception.GestionCampoException;
import com.imagine.gestionsoft.core.service.IClienteService;
import com.imagine.gestionsoft.core.service.INegocioService;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private INegocioService negocioService;

	@Autowired
	private ClienteDao clienteDao;

	@Override
	public ClienteDto crearCliente(ClienteDto clienteDto) {
		negocioService.obtenerNegocio(clienteDto.getNegocioId());

		List<ClienteDto> clientes = clienteDao.findByDocumentoAndNegocioId(clienteDto.getDocumento(),
				clienteDto.getNegocioId());

		if (clientes != null && clientes.size() > 0) {
			throw new GestionCampoException(COD_ERR_CLIENTE_EXISTE, MSJ_ERR_CLIENTE_EXISTE);
		}

		clienteDto.setClienteId(null);
		clienteDto.setFechaRegistro(new Date());
		clienteDto.setEstado(true);

		return clienteDao.save(clienteDto);
	}

	public ClienteDto obtenerClienteNegocio(Integer clienteId, Integer negocioId) {
		negocioService.obtenerNegocio(negocioId);
		ClienteDto cliente = clienteDao.findByClienteIdAndNegocio(clienteId, negocioId);
		if(cliente == null) {
			throw new GestionCampoException(COD_ERR_CLIENTE_EXISTE, MSJ_ERR_CLIENTE_EXISTE);
		}
		return cliente; 
	}

	public List<ClienteDto> obtenerClientesNegocio(Integer negocioId) {
		negocioService.obtenerNegocio(negocioId);
		return clienteDao.findAllByNegocioId(negocioId);
	}

}
