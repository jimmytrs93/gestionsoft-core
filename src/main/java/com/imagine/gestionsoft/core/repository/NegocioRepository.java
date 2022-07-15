package com.imagine.gestionsoft.core.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imagine.gestionsoft.core.entity.NegocioEntity;

@Repository
public interface NegocioRepository extends JpaRepository<NegocioEntity, Integer> {

	Optional<List<NegocioEntity>> findAllByDocumentoOrEmail(String doc, String email);

}
