package com.imagine.gestionsoft.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imagine.gestionsoft.core.entity.NegocioEntity;

@Repository
public interface NegocioRepository extends JpaRepository<NegocioEntity, Integer> {

}
