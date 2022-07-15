package com.imagine.gestionsoft.core.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.imagine.gestionsoft.core.dto.NegocioDto;
import com.imagine.gestionsoft.core.entity.NegocioEntity;
import com.imagine.gestionsoft.core.mapper.NegocioMapper;
import com.imagine.gestionsoft.core.repository.NegocioRepository;

@Component
public class NegocioDao {

	@Autowired
	private NegocioRepository negocioRepository;
	@Autowired
	private NegocioMapper negocioMapper;

	public NegocioDto findById(Integer id) {
		Optional<NegocioEntity> negocioOpt = negocioRepository.findById(id);
		if (negocioOpt.isPresent()) {
			return negocioMapper.dtoToEntity(negocioOpt.get());
		}
		return null;
	}

	public List<NegocioDto> findAll() {
		List<NegocioEntity> entityList = negocioRepository.findAll();
		return negocioMapper.dtoToEntityList(entityList);
	}

	public List<NegocioDto> findAllByDocumentoOrEmail(String doc, String email) {
		Optional<List<NegocioEntity>> listOpt = negocioRepository.findAllByDocumentoOrEmail(doc, email);
		if (listOpt.isPresent()) {
			return negocioMapper.dtoToEntityList(listOpt.get());
		}
		return null;
	}

	public NegocioDto save(NegocioDto negocioDto) {
		NegocioEntity entity = negocioMapper.entityToDto(negocioDto);
		negocioRepository.save(entity);
		return negocioMapper.dtoToEntity(entity);
	}

}
