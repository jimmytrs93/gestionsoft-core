package com.imagine.gestionsoft.core.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imagine.gestionsoft.core.entity.ClienteEntity;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {

	Optional<ClienteEntity> findByClienteId(Integer clienteId);
	
	Optional<ClienteEntity> findByClienteIdAndNegocio(Integer clienteId, Integer negocio);

	List<ClienteEntity> findByDocumentoAndNegocioId(String documento, Integer negocioId);

	List<ClienteEntity> findAllByNegocioId(Integer negocioId);

}
