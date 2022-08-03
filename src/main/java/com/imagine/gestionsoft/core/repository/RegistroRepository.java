package com.imagine.gestionsoft.core.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imagine.gestionsoft.core.entity.RegistroEntity;

@Repository
public interface RegistroRepository extends JpaRepository<RegistroEntity, Integer> {

	List<RegistroEntity> findAllByFacturaId(Integer facturaId);

	Optional<RegistroEntity> findByRegistroIdAndFacturaId(Integer registro, Integer facturaId);

}
