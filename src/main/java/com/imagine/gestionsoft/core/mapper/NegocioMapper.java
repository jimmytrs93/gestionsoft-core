package com.imagine.gestionsoft.core.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.imagine.gestionsoft.core.dto.NegocioDto;
import com.imagine.gestionsoft.core.entity.NegocioEntity;

@Mapper(componentModel = "spring")
public interface NegocioMapper {

	public NegocioDto entityToDto(NegocioEntity entity);

	public NegocioEntity dtoToEntity(NegocioDto dto);

	public List<NegocioDto> entityToDtoList(List<NegocioEntity> entity);

	public List<NegocioEntity> dtoToEntityList(List<NegocioDto> dto);

}
