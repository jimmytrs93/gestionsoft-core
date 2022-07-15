package com.imagine.gestionsoft.core.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.imagine.gestionsoft.core.dto.ItemDto;
import com.imagine.gestionsoft.core.entity.ItemEntity;

@Mapper(componentModel = "spring")
public interface ItemMapper {

	ItemEntity dtoToEntity(ItemDto dto);

	ItemDto entityToDto(ItemEntity entity);

	List<ItemEntity> dtoToEntityList(List<ItemDto> dtos);

	List<ItemDto> entityToDtoList(List<ItemEntity> entities);
}
