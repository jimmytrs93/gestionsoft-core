package com.imagine.gestionsoft.core.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imagine.gestionsoft.core.entity.FacturaEntity;

@Repository
public interface FacturaRepository extends JpaRepository<FacturaEntity, Integer> {

	Optional<FacturaEntity> findByFacturaIdAndNegocioId(Integer factura, Integer negocio);

	List<FacturaEntity> findAllByNegocioId(Integer negocio);

	Optional<FacturaEntity> findByFacturaIdAndFacturaEstado(Integer factura, Integer estado);
}
