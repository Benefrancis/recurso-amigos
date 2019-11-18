package br.com.benefrancis.recursoamigos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.benefrancis.recursoamigos.entity.TipoEvento;

@Repository
public interface TipoEventoRepository extends JpaRepository<TipoEvento,Long>{

}
