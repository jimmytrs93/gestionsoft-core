package com.imagine.gestionsoft.core.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.imagine.gestionsoft.core.dto.RegistroDto;
import com.imagine.gestionsoft.core.entity.RegistroEntity;
import com.imagine.gestionsoft.core.mapper.RegistroMapper;
import com.imagine.gestionsoft.core.repository.RegistroRepository;

@Component
public class RegistroDao {

	@Autowired
	private RegistroRepository repository;
	@Autowired
	private RegistroMapper mapper;

	public RegistroDto save(RegistroDto dto) {
		RegistroEntity entity = mapper.dtoToEntity(dto);
		repository.save(entity);
		return mapper.entityToDto(entity);
	}

	public List<RegistroDto> saveAll(List<RegistroDto> dtos) {
		List<RegistroEntity> entities = mapper.dtoToEntityList(dtos);
		repository.saveAll(entities);
		return mapper.entityToDtoList(entities);
	}

	public List<RegistroDto> findAllByFacturaId(Integer facturaId) {
		List<RegistroEntity> entities = repository.findAllByFacturaId(facturaId);
		return mapper.entityToDtoList(entities);
	}

	public RegistroDto findByRegistroIdAndFacturaId(Integer registro, Integer factura) {
		Optional<RegistroEntity> optional = repository.findByRegistroIdAndFacturaId(registro, factura);
		if (optional.isPresent()) {
			return mapper.entityToDto(optional.get());
		}
		return null;
	}

}
