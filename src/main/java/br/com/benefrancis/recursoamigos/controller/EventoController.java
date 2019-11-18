package br.com.benefrancis.recursoamigos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
