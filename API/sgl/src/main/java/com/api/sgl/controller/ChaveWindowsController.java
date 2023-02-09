package com.api.sgl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.sgl.dao.ChaveWindowsDAO;
import com.api.sgl.entity.ChaveWindowsEntity;
import com.api.sgl.service.ChaveWindowsService;

@RestController
@RequestMapping("/chavewindows")
public class ChaveWindowsController {

	@Autowired
	private ChaveWindowsService chaveWindowsService;
	
	@PostMapping("/save")
	public ResponseEntity<ChaveWindowsEntity> saveChaveWindows(@RequestBody ChaveWindowsDAO chaveWindows){
		
		ChaveWindowsEntity chave = chaveWindowsService.saveChaveWindows(chaveWindows);
		
		if(chave == null) {
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			
		}
		
		return ResponseEntity.status(HttpStatus.CREATED).body(chave);
		
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<ChaveWindowsEntity>> findAllChaveWindows(){
		
		List<ChaveWindowsEntity> chaves = chaveWindowsService.findAllChaves();

		if(chaves.isEmpty()) {
			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(chaves);
		
	}
	
}
