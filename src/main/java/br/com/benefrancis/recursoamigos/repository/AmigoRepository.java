package br.com.benefrancis.recursoamigos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.benefrancis.recursoamigos.entity.Amigo;

@Repository
public interface AmigoRepository extends JpaRepository<Amigo, Long> {

}
