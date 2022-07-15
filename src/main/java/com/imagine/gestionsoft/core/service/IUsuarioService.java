package com.imagine.gestionsoft.core.service;

import java.util.List;

import com.imagine.gestionsoft.core.dto.UsuarioDto;

public interface IUsuarioService {
	
	public UsuarioDto obtenerUsuarioNegocio(Integer usuarioId, Integer negocioId);
	
	public List<UsuarioDto> obtenerUsuariosNegocio(Integer negocioId);
	
	public UsuarioDto crearUsuario(UsuarioDto dto);
	
	public UsuarioDto editarUsuario(UsuarioDto dto);

}
