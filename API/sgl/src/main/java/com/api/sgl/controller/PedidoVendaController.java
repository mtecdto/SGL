package com.api.sgl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.sgl.entity.PedidoVendaEntity;
import com.api.sgl.service.PedidoVendaService;

@RestController
@RequestMapping("/pv")
public class PedidoVendaController {

	@Autowired
	private PedidoVendaService pedidoVendaService;
	
	@PostMapping("/save")
	public ResponseEntity<PedidoVendaEntity> savePV(@RequestBody PedidoVendaEntity pv){
		
		PedidoVendaEntity pvResponse = pedidoVendaService.savePedidoVenda(pv);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(pvResponse);
		
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<PedidoVendaEntity>> findAllPedidoVenda(){
		
		List<PedidoVendaEntity> pvs = pedidoVendaService.findAllPedidoVenda();
		
		return ResponseEntity.ok().body(pvs);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deletePedidoVenda(@PathVariable Long id){
		
		HttpStatus statuscode = pedidoVendaService.deletePedidoVenda(id);
		
		return ResponseEntity.status(statuscode).body(statuscode);
		
	}
	
}
