package com.imagine.gestionsoft.core.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.imagine.gestionsoft.core.dto.ClienteDto;
import com.imagine.gestionsoft.core.entity.ClienteEntity;
import com.imagine.gestionsoft.core.mapper.ClienteMapper;
import com.imagine.gestionsoft.core.repository.ClienteRepository;

@Component
public class ClienteDao {

	@Autowired
	private ClienteRepository repository;

	@Autowired
	private ClienteMapper mapper;

	public ClienteDto findByClienteId(Integer clienteId) {
		Optional<ClienteEntity> clienteOpt = repository.findByClienteId(clienteId);
		if (clienteOpt.isPresent()) {
			return mapper.entityToDto(clienteOpt.get());
		}
		return null;
	}

	public ClienteDto save(ClienteDto clienteDto) {
		ClienteEntity entity = mapper.dtoToEntity(clienteDto);
		repository.save(entity);
		return mapper.entityToDto(entity);
	}

	public List<ClienteDto> findByDocumentoAndNegocioId(String documento, Integer negocioId) {
		List<ClienteEntity> entityList = repository.findByDocumentoAndNegocioId(documento, negocioId);
		return mapper.entityToDtoList(entityList);
	}

	public List<ClienteDto> findAllByNegocioId(Integer negocioId) {
		List<ClienteEntity> entityList = repository.findAllByNegocioId(negocioId);
		return mapper.entityToDtoList(entityList);
	}

}
