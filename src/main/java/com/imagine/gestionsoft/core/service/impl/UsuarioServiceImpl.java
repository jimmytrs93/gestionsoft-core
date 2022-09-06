package com.imagine.gestionsoft.core.service.impl;

import static com.imagine.gestionsoft.core.constans.GestionConstantesRespuesta.*;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imagine.gestionsoft.core.dao.UsuarioDao;
import com.imagine.gestionsoft.core.dto.UsuarioDto;
import com.imagine.gestionsoft.core.exception.GestionCampoException;
import com.imagine.gestionsoft.core.service.INegocioService;
import com.imagine.gestionsoft.core.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private UsuarioDao usuarioDao;
	@Autowired
	private INegocioService negocioService;

	@Override
	public UsuarioDto obtenerUsuarioNegocio(Integer usuarioId, Integer negocioId) {
		return usuarioDao.findByUsuarioIdAndNegocioId(usuarioId, negocioId);
	}

	@Override
	public List<UsuarioDto> obtenerUsuariosNegocio(Integer negocioId) {
		return usuarioDao.findAllByNegocioId(negocioId);
	}

	@Override
	public UsuarioDto crearUsuario(UsuarioDto dto) {

		String documento = dto.getDocumento().trim();
		negocioService.obtenerNegocio(dto.getNegocioId());
		UsuarioDto usuarioDto = usuarioDao.findByDocumentoAndNegocioId(documento, dto.getNegocioId());

		if (usuarioDto != null) {
			throw new GestionCampoException(COD_ERR_USUARIO_EXISTE, MSJ_ERR_USUARIO_EXISTE);
		}

		dto.setUsuarioId(null);
		dto.setDocumento(documento);
		dto.setFechaCreacion(new Date());
		dto.setEstado(true);
		dto.setCambioContrasena(true);

		return usuarioDao.save(dto);
	}

	@Override
	public UsuarioDto editarUsuario(UsuarioDto dto) {

		String documento = dto.getDocumento().trim();
		negocioService.obtenerNegocio(dto.getNegocioId());

		UsuarioDto usuarioDto = usuarioDao.findByUsuarioIdAndNegocioId(dto.getUsuarioId(), dto.getNegocioId());

		if (usuarioDto == null) {
			throw new GestionCampoException(COD_ERR_USUARIO_NEG_NO_EXISTE, MSJ_ERR_USUARIO_NEG_NO_EXISTE);
		}

		dto.setDocumento(documento);

		return usuarioDao.save(dto);
	}

}
