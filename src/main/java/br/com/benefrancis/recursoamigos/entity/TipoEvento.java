package br.com.benefrancis.recursoamigos.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class TipoEvento {
	@Id
	private Long id;

	private String descricao;
}
