package com.imagine.gestionsoft.core.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.imagine.gestionsoft.core.dto.FacturaDto;
import com.imagine.gestionsoft.core.entity.FacturaEntity;

@Mapper(componentModel = "spring")
public interface FacturaMapper {

	public FacturaDto entityToDto(FacturaEntity entity);

	public FacturaEntity dtoToEntity(FacturaDto dto);

	public List<FacturaDto> entityToDtoList(List<FacturaEntity> entities);

	public List<FacturaEntity> dtoToEntityList(List<FacturaDto> dtos);
}
