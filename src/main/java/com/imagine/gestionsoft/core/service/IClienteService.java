package com.imagine.gestionsoft.core.service;

import java.util.List;

import com.imagine.gestionsoft.core.dto.ClienteDto;

public interface IClienteService {

	public ClienteDto crearCliente(ClienteDto clienteDto);

	public ClienteDto obtenerCliente(Integer clienteId);

	public List<ClienteDto> obtenerClientesNegocio(Integer negocioId);

}
