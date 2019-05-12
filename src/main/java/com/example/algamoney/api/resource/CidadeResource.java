package com.example.algamoney.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.algamoney.api.model.Cidade;
import com.example.algamoney.api.repository.CidadeRepository;

@RestController
@RequestMapping("/cidades")
public class CidadeResource {
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@GetMapping	
	public List<Cidade> listar() {
		return cidadeRepository.findAll();		
	}
	
	@GetMapping("/{codigo}")	
	public ResponseEntity<Cidade> buscarPeloCodigo(@PathVariable Long codigo) {
		Cidade cidade = cidadeRepository.findOne(codigo);
		return cidade != null ? ResponseEntity.ok().body(cidade) : ResponseEntity.notFound().build(); 
	}
	
	@GetMapping("/estado/{codigo}")	
	public List<Cidade> buscarPorEstado(@PathVariable Long codigo) {
		return cidadeRepository.findByEstadoCodigo(codigo);		 
	}


}
