package com.imagine.gestionsoft.core.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.imagine.gestionsoft.core.dto.ColaboradorDto;
import com.imagine.gestionsoft.core.entity.ColaboradorEntity;

@Mapper(componentModel = "spring")
public interface ColaboradorMapper {

	public ColaboradorDto dtoToEntity(ColaboradorEntity entity);

	public ColaboradorEntity entityToDto(ColaboradorDto dto);

	public List<ColaboradorDto> dtoToEntityList(List<ColaboradorEntity> entity);

	public List<ColaboradorEntity> entityToDtoList(List<ColaboradorDto> dto);

}
