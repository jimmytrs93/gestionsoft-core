package com.imagine.gestionsoft.core.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imagine.gestionsoft.core.entity.ItemEntity;

public interface ItemRepository extends JpaRepository<ItemEntity, Integer> {

	Optional<ItemEntity> findByItemId(Integer itemId);

	Optional<ItemEntity> findByItemIdAndNegocioId(Integer itemId, Integer negocioId);

	List<ItemEntity> findByNegocioIdAndCodigoContains(Integer negocioId, String codigo);

	List<ItemEntity> findByNegocioIdAndCodigo(Integer negocioId, String codigo);

	List<ItemEntity> findByNegocioId(Integer negocioId);

}
