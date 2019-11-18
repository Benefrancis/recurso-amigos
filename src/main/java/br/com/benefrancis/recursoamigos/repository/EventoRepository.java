package br.com.benefrancis.recursoamigos.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.benefrancis.recursoamigos.entity.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
	public Optional<List<Evento>> findByData(Date data);
}
