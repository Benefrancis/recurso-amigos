package br.com.benefrancis.recursoamigos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.benefrancis.recursoamigos.entity.Amigo;
import br.com.benefrancis.recursoamigos.repository.AmigoRepository;

@Service
public class AmigoService {
	@Autowired
	private AmigoRepository repo;

	public List<Amigo> findAll() {
		return repo.findAll();
	}

	public Amigo findById(Long id) {
		Optional<Amigo> opt = repo.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			return null;
		}
	}

}
