package com.imagine.gestionsoft.core.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.imagine.gestionsoft.core.entity.ReservaEntity;

@Repository
public interface ReservaRepository
		extends JpaRepository<ReservaEntity, Integer>, JpaSpecificationExecutor<ReservaEntity> {

	List<ReservaEntity> findAllByNegocioId(Integer negocio);

	List<ReservaEntity> findAllByClienteId(Integer cliente);

	Optional<ReservaEntity> findByReservaId(Integer reserva);

	List<ReservaEntity> findAllByNegocioIdAndClienteIdAndEstado(Integer negocio, Integer cliente, Boolean estado);

}
