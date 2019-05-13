package com.example.algamoney.api.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.algamoney.api.model.Estado;
import com.example.algamoney.api.repository.EstadoRepository;

@RestController
@RequestMapping("/estados")
public class EstadoResource {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@GetMapping	
	public List<Estado> listar() {
		return estadoRepository.findAll();		
	}
	
	@GetMapping("/{codigo}")	
	public ResponseEntity<Estado> buscarPeloCodigo(@PathVariable Long codigo) {
		Optional<Estado> estado = estadoRepository.findById(codigo);
		return estado.isPresent() ? ResponseEntity.ok().body(estado.get()) : ResponseEntity.notFound().build(); 
	}


}
