package com.imagine.gestionsoft.core.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.imagine.gestionsoft.core.dto.NegocioDto;
import com.imagine.gestionsoft.core.entity.NegocioEntity;

@Mapper(componentModel = "spring")
public interface NegocioMapper {

	public NegocioDto dtoToEntity(NegocioEntity entity);

	public NegocioEntity entityToDto(NegocioDto dto);

	public List<NegocioDto> dtoToEntityList(List<NegocioEntity> entity);

	public List<NegocioEntity> entityToDtoList(List<NegocioDto> dto);

}
