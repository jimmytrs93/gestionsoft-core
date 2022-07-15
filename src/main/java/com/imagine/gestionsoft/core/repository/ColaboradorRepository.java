package com.imagine.gestionsoft.core.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imagine.gestionsoft.core.entity.ColaboradorEntity;

public interface ColaboradorRepository extends JpaRepository<ColaboradorEntity, Integer> {

	List<ColaboradorEntity> findAllByNegocioId(Integer negocioId);

	Optional<ColaboradorEntity> findByColaboradorId(Integer colaboradorId);

	Optional<ColaboradorEntity> findByDocumentoAndNegocioId(String documento, Integer negocioId);

}
