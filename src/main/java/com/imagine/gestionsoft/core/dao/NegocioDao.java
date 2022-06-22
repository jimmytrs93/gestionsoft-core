package com.imagine.gestionsoft.core.dao;

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

}
