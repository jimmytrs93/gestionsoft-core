package com.imagine.gestionsoft.core.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.imagine.gestionsoft.core.dto.RegistroDto;
import com.imagine.gestionsoft.core.entity.RegistroEntity;

@Mapper(componentModel = "spring")
public interface RegistroMapper {

	public RegistroDto entityToDto(RegistroEntity entity);

	public RegistroEntity dtoToEntity(RegistroDto dto);

	public List<RegistroDto> entityToDtoList(List<RegistroEntity> entities);

	public List<RegistroEntity> dtoToEntityList(List<RegistroDto> dtos);
}
