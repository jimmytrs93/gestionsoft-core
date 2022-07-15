package com.imagine.gestionsoft.core.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.imagine.gestionsoft.core.dto.ColaboradorDto;
import com.imagine.gestionsoft.core.entity.ColaboradorEntity;
import com.imagine.gestionsoft.core.mapper.ColaboradorMapper;
import com.imagine.gestionsoft.core.repository.ColaboradorRepository;

@Component
public class ColaboradorDao {

	@Autowired
	private ColaboradorRepository repository;
	@Autowired
	private ColaboradorMapper mapper;

	public List<ColaboradorDto> findAllByNegocioId(Integer negocioId) {
		List<ColaboradorEntity> entityList = repository.findAllByNegocioId(negocioId);
		return mapper.entityToDtoList(entityList);
	}

	public ColaboradorDto findByColaboradorId(Integer colaboradorId) {
		Optional<ColaboradorEntity> colOpt = repository.findByColaboradorId(colaboradorId);
		if (colOpt.isPresent()) {
			return mapper.entityToDto(colOpt.get());
		}
		return null;
	}

	public ColaboradorDto save(ColaboradorDto dto) {
		ColaboradorEntity entity = mapper.dtoToEntity(dto);
		repository.save(entity);
		return mapper.entityToDto(entity);
	}

	public ColaboradorDto findByDocumentoAndNegocioId(String documento, Integer negocioId) {
		Optional<ColaboradorEntity> colOpt = repository.findByDocumentoAndNegocioId(documento, negocioId);
		if (colOpt.isPresent()) {
			return mapper.entityToDto(colOpt.get());
		}
		return null;
	}
}
