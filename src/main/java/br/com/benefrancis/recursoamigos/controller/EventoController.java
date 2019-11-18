package br.com.benefrancis.recursoamigos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.benefrancis.recursoamigos.entity.Evento;
import br.com.benefrancis.recursoamigos.service.EventoService;

@RestController
public class EventoController {

	@Autowired
	private EventoService service;

	@GetMapping(value = "/eventos")
	public List<Evento> findAll() {
		return service.findAll();
	}

	@GetMapping(value = "/evento/{id}")
	public Evento findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping(value = "/evento")
	public Evento save(@RequestBody Evento e) {
		Evento salvo = service.save(e);
		return findById(salvo.getId());
	}

}
