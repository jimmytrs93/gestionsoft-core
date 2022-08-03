package com.imagine.gestionsoft.core.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.imagine.gestionsoft.core.dto.FacturaDto;
import com.imagine.gestionsoft.core.entity.FacturaEntity;
import com.imagine.gestionsoft.core.mapper.FacturaMapper;
import com.imagine.gestionsoft.core.repository.FacturaRepository;

@Component
public class FacturaDao {

	@Autowired
	private FacturaRepository repository;
	@Autowired
	private FacturaMapper mapper;

	public FacturaDto findByFacturaIdAndNegocioId(Integer factura, Integer negocio) {
		Optional<FacturaEntity> opt = repository.findByFacturaIdAndNegocioId(factura, negocio);
		if (opt.isPresent()) {
			return mapper.entityToDto(opt.get());
		}
		return null;
	}

	public List<FacturaDto> findAllByNegocioId(Integer negocio) {
		List<FacturaEntity> entities = repository.findAllByNegocioId(negocio);
		return mapper.entityToDtoList(entities);
	}

	public FacturaDto save(FacturaDto dto) {
		FacturaEntity entity = mapper.dtoToEntity(dto);
		repository.save(entity);
		return mapper.entityToDto(entity);
	}

	public FacturaDto findByFacturaIdAndFacturaEstado(Integer factura, Integer estado) {
		Optional<FacturaEntity> entityOpt = repository.findByFacturaIdAndFacturaEstado(factura, estado);
		if (entityOpt.isPresent()) {
			return mapper.entityToDto(entityOpt.get());
		}
		return null;
	}

}
