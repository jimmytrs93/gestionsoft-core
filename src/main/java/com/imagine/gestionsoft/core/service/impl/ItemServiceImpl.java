package com.imagine.gestionsoft.core.service.impl;

import static com.imagine.gestionsoft.core.constans.GestionConstantesRespuesta.*;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imagine.gestionsoft.core.dao.ItemDao;
import com.imagine.gestionsoft.core.dto.ItemDto;
import com.imagine.gestionsoft.core.exception.GestionCampoException;
import com.imagine.gestionsoft.core.service.IItemService;
import com.imagine.gestionsoft.core.service.INegocioService;

@Service
public class ItemServiceImpl implements IItemService {

	@Autowired
	private ItemDao itemDao;
	@Autowired
	private INegocioService negocioService;

	@Override
	public ItemDto obtenerItem(Integer itemId) {
		return itemDao.findByItemId(itemId);
	}

	@Override
	public List<ItemDto> obtenerItemsNegocio(Integer negocioId) {
		negocioService.obtenerNegocio(negocioId);
		return itemDao.findByNegocioId(negocioId);
	}

	@Override
	public List<ItemDto> obtenerItemsNegocioCodigo(Integer negocio, String codigo) {
		negocioService.obtenerNegocio(negocio);
		return itemDao.findByNegocioIdAndCodigoContains(negocio, codigo.trim());
	}

	@Override
	public ItemDto crearItem(ItemDto itemDto) {
		negocioService.obtenerNegocio(itemDto.getItemId());

		String codigo = itemDto.getCodigo().trim().toUpperCase();

		List<ItemDto> list = itemDao.findByNegocioIdAndCodigo(itemDto.getNegocioId(), codigo);
		if (list != null && list.size() > 0) {
			throw new GestionCampoException(COD_ERR_ITEM_EXISTE, MSJ_ERR_ITEM_EXISTE);
		}

		itemDto.setItemId(null);
		itemDto.setCodigo(codigo);
		itemDto.setFechaCreacion(new Date());
		itemDto.setEstado(true);

		return itemDao.save(itemDto);
	}

	@Override
	public ItemDto editarItem(ItemDto itemDto) {
		negocioService.obtenerNegocio(itemDto.getItemId());

		ItemDto consul = itemDao.findByItemIdAndNegocioId(itemDto.getItemId(), itemDto.getNegocioId());

		if (consul == null) {
			throw new GestionCampoException(COD_ERR_ITEM_NEG_NO_EXISTE, MSJ_ERR_ITEM_NEG_NO_EXISTE);
		}

		return itemDao.save(itemDto);
	}

}
