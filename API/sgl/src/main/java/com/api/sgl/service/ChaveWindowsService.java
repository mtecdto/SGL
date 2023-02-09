package com.api.sgl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.sgl.dao.ChaveWindowsDAO;
import com.api.sgl.entity.ChaveWindowsEntity;
import com.api.sgl.repository.ChaveWindowsRepository;

@Service
public class ChaveWindowsService {

	@Autowired
	private ChaveWindowsRepository chaveWindowsRepository;
	
	@Autowired
	private NotaService notaService;
	
	@Autowired
	private PedidoVendaService pedidoVendaService;
	
	public ChaveWindowsEntity saveChaveWindows(ChaveWindowsDAO chaveWindows) {
		
		ChaveWindowsEntity chaveEntity = new ChaveWindowsEntity();
		chaveEntity.setConteudo(chaveWindows.getConteudo());
		chaveEntity.setSerial(chaveWindows.getSerial());
		chaveEntity.setHdssd(chaveWindows.getHdssd());
		chaveEntity.setMemoria(chaveWindows.getMemoria());
		chaveEntity.setStatus(chaveWindows.getStatus());
		
		chaveEntity.setNota(notaService.findByIdNota(chaveWindows.getNota()));
		
		chaveEntity.setPedidoVenda(pedidoVendaService.findByIdPedidoVenda(chaveWindows.getPedidoVenda()));
		
		return chaveWindowsRepository.save(chaveEntity);
		
	}
	
	public List<ChaveWindowsEntity> findAllChaves(){
		
		return chaveWindowsRepository.findAll();
		
	}
	
}
