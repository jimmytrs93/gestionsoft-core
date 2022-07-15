package com.imagine.gestionsoft.core.service;

import java.util.List;

import com.imagine.gestionsoft.core.dto.ItemDto;

public interface IItemService {

	public ItemDto obtenerItem(Integer itemId);

	public List<ItemDto> obtenerItemsNegocio(Integer negocioId);

	public List<ItemDto> obtenerItemsNegocioCodigo(Integer negocio, String codigo);
	
	public ItemDto crearItem(ItemDto itemDto);
	
	public ItemDto editarItem(ItemDto itemDto);

}
