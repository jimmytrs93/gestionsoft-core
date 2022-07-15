package com.imagine.gestionsoft.core.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.imagine.gestionsoft.core.dto.ClienteDto;
import com.imagine.gestionsoft.core.entity.ClienteEntity;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

	public ClienteEntity dtoToEntity(ClienteDto dto);

	public ClienteDto entityToDto(ClienteEntity entity);

	public List<ClienteEntity> dtoToEntityList(List<ClienteDto> dto);

	public List<ClienteDto> entityToDtoList(List<ClienteEntity> entity);

}
