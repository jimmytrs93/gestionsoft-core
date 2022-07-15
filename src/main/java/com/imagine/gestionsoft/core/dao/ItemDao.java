package com.imagine.gestionsoft.core.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.imagine.gestionsoft.core.dto.ItemDto;
import com.imagine.gestionsoft.core.entity.ItemEntity;
import com.imagine.gestionsoft.core.mapper.ItemMapper;
import com.imagine.gestionsoft.core.repository.ItemRepository;

@Component
public class ItemDao {

	@Autowired
	private ItemRepository repository;

	@Autowired
	private ItemMapper mapper;

	public ItemDto save(ItemDto dto) {
		ItemEntity entity = mapper.dtoToEntity(dto);
		repository.save(entity);
		return mapper.entityToDto(entity);
	}

	public ItemDto findByItemId(Integer ItemId) {
		Optional<ItemEntity> itemOpt = repository.findById(ItemId);
		if (itemOpt.isPresent()) {
			return mapper.entityToDto(itemOpt.get());
		}
		return null;
	}

	public List<ItemDto> findByNegocioIdAndCodigoContains(Integer negocioId, String codigo) {
		List<ItemEntity> itemList = repository.findByNegocioIdAndCodigoContains(negocioId, codigo);
		return mapper.entityToDtoList(itemList);
	}

	public List<ItemDto> findByNegocioIdAndCodigo(Integer negocioId, String codigo) {
		List<ItemEntity> itemList = repository.findByNegocioIdAndCodigo(negocioId, codigo);
		return mapper.entityToDtoList(itemList);
	}

	public List<ItemDto> findByNegocioId(Integer negocioId) {
		List<ItemEntity> itemList = repository.findByNegocioId(negocioId);
		return mapper.entityToDtoList(itemList);
	}

	public ItemDto findByItemIdAndNegocioId(Integer itemId, Integer negocioId) {
		Optional<ItemEntity> itemOpt = repository.findByItemIdAndNegocioId(itemId, negocioId);
		if (itemOpt.isPresent()) {
			return mapper.entityToDto(itemOpt.get());
		}
		return null;
	}
}
