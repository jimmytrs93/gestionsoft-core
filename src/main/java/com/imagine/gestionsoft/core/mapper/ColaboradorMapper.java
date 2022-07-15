package com.imagine.gestionsoft.core.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.imagine.gestionsoft.core.dto.ColaboradorDto;
import com.imagine.gestionsoft.core.entity.ColaboradorEntity;

@Mapper(componentModel = "spring")
public interface ColaboradorMapper {

	public ColaboradorDto entityToDto(ColaboradorEntity entity);

	public ColaboradorEntity dtoToEntity(ColaboradorDto dto);

	public List<ColaboradorDto> entityToDtoList(List<ColaboradorEntity> entity);

	public List<ColaboradorEntity> dtoToEntityList(List<ColaboradorDto> dto);

}
