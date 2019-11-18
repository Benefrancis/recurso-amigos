package br.com.benefrancis.recursoamigos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.benefrancis.recursoamigos.entity.TipoEvento;
import br.com.benefrancis.recursoamigos.repository.TipoEventoRepository;

@Service
public class TipoEventoService {
	@Autowired
	private TipoEventoRepository repo;

	public List<TipoEvento> findAll() {
		return repo.findAll();
	}

	public TipoEvento findById(Long id) {
		Optional<TipoEvento> opt = repo.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			return null;
		}
	}
}
