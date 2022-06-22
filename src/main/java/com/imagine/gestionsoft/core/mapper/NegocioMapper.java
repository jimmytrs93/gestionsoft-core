package com.imagine.gestionsoft.core.mapper;

import org.mapstruct.Mapper;

import com.imagine.gestionsoft.core.dto.NegocioDto;
import com.imagine.gestionsoft.core.entity.NegocioEntity;

@Mapper(componentModel = "spring")
public interface NegocioMapper {

	public NegocioDto dtoToEntity(NegocioEntity entity);

	public NegocioEntity entityToDto(NegocioDto dto);

}
