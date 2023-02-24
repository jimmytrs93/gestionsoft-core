package com.imagine.gestionsoft.core.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imagine.gestionsoft.core.entity.RolEntity;

public interface RolRepository extends JpaRepository<RolEntity, Integer> {

	public Optional<RolEntity> findByNombre(String nombre);

}
