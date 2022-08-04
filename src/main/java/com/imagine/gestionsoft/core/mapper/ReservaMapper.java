package com.imagine.gestionsoft.core.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.imagine.gestionsoft.core.dto.ReservaDto;
import com.imagine.gestionsoft.core.entity.ReservaEntity;

@Mapper(componentModel = "spring")
public interface ReservaMapper {

	public ReservaDto entityToDto(ReservaEntity entity);

	public ReservaEntity dtoToEntity(ReservaDto dto);

	public List<ReservaDto> entityToDtoList(List<ReservaEntity> entities);

	public List<ReservaEntity> dtoToEntityList(List<ReservaDto> dtos);

}
