package com.imagine.gestionsoft.core.dao;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import com.imagine.gestionsoft.core.dto.ReservaCriterialDto;
import com.imagine.gestionsoft.core.dto.ReservaDto;
import com.imagine.gestionsoft.core.entity.ReservaEntity;
import com.imagine.gestionsoft.core.mapper.ReservaMapper;
import com.imagine.gestionsoft.core.repository.ReservaRepository;

@Component
public class ReservaDao {

	@Autowired
	private ReservaMapper mapper;
	@Autowired
	private ReservaRepository repository;

	public ReservaDto save(ReservaDto dto) {

		ReservaEntity entity = mapper.dtoToEntity(dto);
		repository.save(entity);
		return mapper.entityToDto(entity);

	}

	public List<ReservaDto> findAllByNegocioIdAndClienteIdAndEstado(Integer negocio, Integer cliente, Boolean estado) {
		List<ReservaEntity> entities = repository.findAllByNegocioIdAndClienteIdAndEstado(negocio, cliente, estado);
		return mapper.entityToDtoList(entities);
	}

	public ReservaDto findByReservaId(Integer reserva) {
		Optional<ReservaEntity> entityOpt = repository.findByReservaId(reserva);
		if (entityOpt.isPresent()) {
			return mapper.entityToDto(entityOpt.get());
		}
		return null;
	}

	public List<ReservaDto> findCriterial(ReservaCriterialDto dto) {
		List<ReservaEntity> entities = repository.findAll(new Specification<ReservaEntity>() {
			private static final long serialVersionUID = 1L;

			@Override
			public Predicate toPredicate(Root<ReservaEntity> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {
				Predicate p = cb.conjunction();

				if (dto.getNegocioId() != null && dto.getNegocioId() > 0) {
					p = cb.and(p, cb.equal(root.get("negocio_id"), dto.getNegocioId()));
				}

				if (dto.getClienteId() != null && dto.getClienteId() > 0) {
					p = cb.and(p, cb.equal(root.get("cliente_id"), dto.getClienteId()));
				}

				if (dto.getColaboradorId() != null && dto.getColaboradorId() > 0) {
					p = cb.and(p, cb.equal(root.get("colaborador_id"), dto.getColaboradorId()));
				}

				if (dto.getItemId() != null && dto.getItemId() > 0) {
					p = cb.and(p, cb.equal(root.get("item_id"), dto.getItemId()));
				}

				if (dto.getEstado() != null) {
					p = cb.and(p, cb.equal(root.get("estado"), dto.getEstado()));
				}

				if (dto.getEfectiva() != null) {
					p = cb.and(p, cb.equal(root.get("efectiva"), dto.getEfectiva()));
				}

				if (dto.getObservacion() != null && !dto.getObservacion().trim().isEmpty()) {
					p = cb.and(p, cb.like(root.get("observacion"), "%" + dto.getObservacion() + "%"));
				}

				if (Objects.nonNull(dto.getFechaFin()) && Objects.nonNull(dto.getFechaIni())
						&& dto.getFechaIni().before(dto.getFechaFin())) {
					p = cb.and(p, cb.between(root.get("fecha"), dto.getFechaIni(), dto.getFechaFin()));
				}

				if (Objects.nonNull(dto.getFechaCreacionFin()) && Objects.nonNull(dto.getFechaCreacionIni())
						&& dto.getFechaCreacionIni().before(dto.getFechaCreacionFin())) {
					p = cb.and(p, cb.between(root.get("fecha_creacion"), dto.getFechaCreacionIni(),
							dto.getFechaCreacionFin()));
				}

				return p;
			}
		});
		return mapper.entityToDtoList(entities);
	}
}
