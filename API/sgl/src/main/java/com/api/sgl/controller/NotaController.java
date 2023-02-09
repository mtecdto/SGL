package com.api.sgl.controller;

import java.util.List;
import java.util.Optional;

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

import com.api.sgl.entity.Nota;
import com.api.sgl.service.NotaService;

@RestController
@RequestMapping("/nota")
public class NotaController {

	@Autowired
	private NotaService notaService;
	
	@PostMapping("/save")
	public ResponseEntity<Nota> saveNota(@RequestBody Nota nota){
		
		Nota notaResponse = notaService.saveNota(nota);
		
		return ResponseEntity.ok().body(notaResponse);
		
	}
	
	@GetMapping("/findById/{id}")
	public Optional<Nota> findByIdNota(@PathVariable("id") Long id) {
		
		return notaService.findByIdNota(id);
		
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<Nota>> findAllNotas(){
		
		List<Nota> notas = notaService.findAllNotas();
		
		if(notas.isEmpty()) {
			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(notas);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteNota(@PathVariable Long id){
		
		HttpStatus statuscode = notaService.deleteNota(id);
		
		return ResponseEntity.status(statuscode).build();
		
	}
	
}
