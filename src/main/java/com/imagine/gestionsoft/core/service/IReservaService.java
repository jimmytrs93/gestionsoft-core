package com.imagine.gestionsoft.core.service;

import java.util.List;

import com.imagine.gestionsoft.core.dto.ReservaCriterialDto;
import com.imagine.gestionsoft.core.dto.ReservaDto;

public interface IReservaService {

	public ReservaDto crearReserva(ReservaDto dto);

	public ReservaDto actualizarReserva(ReservaDto dto);

	public List<ReservaDto> obtenerReservasCriterios(ReservaCriterialDto criterialDto);

}
