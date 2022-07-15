package com.imagine.gestionsoft.core.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.imagine.gestionsoft.core.dto.UsuarioDto;
import com.imagine.gestionsoft.core.entity.UsuarioEntity;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

	public UsuarioDto entityToDto(UsuarioEntity entity);

	public UsuarioEntity dtoToEntity(UsuarioDto dto);

	public List<UsuarioDto> entityToDtoList(List<UsuarioEntity> entities);

	public List<UsuarioEntity> dtoToEntityList(List<UsuarioDto> dtos);

}
