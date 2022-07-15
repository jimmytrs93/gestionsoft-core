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
		return mapper.dtoToEntityList(entityList);
	}

	public ColaboradorDto save(ColaboradorDto dto) {
		ColaboradorEntity entity = mapper.entityToDto(dto);
		repository.save(entity);
		return mapper.dtoToEntity(entity);
	}

	public ColaboradorDto findByDocumento(String documento) {
		Optional<ColaboradorEntity> colOpt = repository.findByDocumento(documento);
		if (colOpt.isPresent()) {
			return mapper.dtoToEntity(colOpt.get());
		}
		return null;
	}
}
