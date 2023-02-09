package com.api.sgl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.api.sgl.entity.PedidoVendaEntity;
import com.api.sgl.repository.PedidoVendaRepository;

@Service
public class PedidoVendaService {

	@Autowired
	private PedidoVendaRepository pedidoVendaRepository;
	
	public PedidoVendaEntity savePedidoVenda(PedidoVendaEntity pv) {
		
		return pedidoVendaRepository.save(pv);
		
	}
	
	public Optional<PedidoVendaEntity> findByIdPedidoVenda(Long id) {
		
		return pedidoVendaRepository.findById(id);
		
	}
	
	public List<PedidoVendaEntity> findAllPedidoVenda(){
		
		return pedidoVendaRepository.findAll();
		
	}
	
	public HttpStatus deletePedidoVenda(Long id) {
		
		pedidoVendaRepository.deleteById(id);
		
		if(pedidoVendaRepository.findById(id).isEmpty()) {
			
			return HttpStatus.OK;
			
		}
		
		return HttpStatus.BAD_REQUEST;
		
	}
	
}
