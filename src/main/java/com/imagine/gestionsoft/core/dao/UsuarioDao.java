package com.imagine.gestionsoft.core.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.imagine.gestionsoft.core.dto.UsuarioDto;
import com.imagine.gestionsoft.core.entity.UsuarioEntity;
import com.imagine.gestionsoft.core.mapper.UsuarioMapper;
import com.imagine.gestionsoft.core.repository.UsuarioRespository;

@Component
public class UsuarioDao {

	@Autowired
	private UsuarioRespository respository;

	@Autowired
	private UsuarioMapper mapper;

	public UsuarioDto save(UsuarioDto usuarioDto) {
		UsuarioEntity entity = mapper.dtoToEntity(usuarioDto);
		respository.save(entity);
		return mapper.entityToDto(entity);
	}

	public List<UsuarioDto> findAllByNegocioId(Integer negocioId) {
		List<UsuarioEntity> entities = respository.findAllByNegocioId(negocioId);
		return mapper.entityToDtoList(entities);
	}

	public UsuarioDto findByDocumentoAndNegocioId(String documento, Integer negocioId) {
		Optional<UsuarioEntity> optional = respository.findByDocumentoAndNegocioId(documento, negocioId);
		if (optional.isPresent()) {
			return mapper.entityToDto(optional.get());
		}
		return null;
	}

	public UsuarioDto findByUsuarioIdAndNegocioId(Integer usuarioId, Integer negocioId) {
		Optional<UsuarioEntity> optional = respository.findByUsuarioIdAndNegocioId(usuarioId, negocioId);
		if (optional.isPresent()) {
			return mapper.entityToDto(optional.get());
		}
		return null;
	}

}
