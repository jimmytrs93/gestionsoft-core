package com.imagine.gestionsoft.core.service;

import java.util.List;

import com.imagine.gestionsoft.core.dto.ClienteDto;

public interface IClienteService {

	public ClienteDto crearCliente(ClienteDto clienteDto);

	public ClienteDto obtenerClienteNegocio(Integer clienteId, Integer negocioId);

	public List<ClienteDto> obtenerClientesNegocio(Integer negocioId);

}
