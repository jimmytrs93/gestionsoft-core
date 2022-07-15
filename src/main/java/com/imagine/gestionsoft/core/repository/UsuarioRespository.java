package com.imagine.gestionsoft.core.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imagine.gestionsoft.core.entity.UsuarioEntity;

public interface UsuarioRespository extends JpaRepository<UsuarioEntity, Integer> {
	
	Optional<UsuarioEntity> findByDocumentoAndNegocioId(String documento, Integer negocioId);
	
	Optional<UsuarioEntity> findByUsuarioIdAndNegocioId(Integer usuarioId, Integer negocioId);
	
	List<UsuarioEntity> findAllByNegocioId(Integer negocioId);
	
	

}
