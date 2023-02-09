package com.api.sgl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.api.sgl.entity.Nota;
import com.api.sgl.repository.NotaRepository;

@Service
public class NotaService {

	@Autowired
	private NotaRepository notaRepository;
	
	public Nota saveNota(Nota nota) {
		
		return notaRepository.save(nota);
		
	}
	
	public Optional<Nota> findByIdNota(Long id) {
		
		return notaRepository.findById(id);
		
	}
	
	public List<Nota> findAllNotas(){
		
		return notaRepository.findAll();
		
	}
	
	public HttpStatus deleteNota(Long id) {
		
		notaRepository.deleteById(id);
		
		if(notaRepository.findById(id).isEmpty()) {
			
			return HttpStatus.OK;
			
		}
		
		return HttpStatus.BAD_REQUEST;
		
	}
	
}
