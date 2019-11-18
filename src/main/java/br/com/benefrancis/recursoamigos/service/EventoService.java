package br.com.benefrancis.recursoamigos.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.benefrancis.recursoamigos.entity.Evento;
import br.com.benefrancis.recursoamigos.repository.EventoRepository;

@Service
public class EventoService {
	@Autowired
	private EventoRepository repo;

	public List<Evento> findAll() {
		return repo.findAll();
	}

	public Evento findById(Long id) {
		Optional<Evento> opt = repo.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			return null;
		}
	}

	public List<Evento> findByData(Date data) {
		Optional<List<Evento>> opt = repo.findByData(data);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			return new ArrayList<Evento>();
		}
	}

	public Evento save(Evento e) {
		return repo.save(e);
	}
}
