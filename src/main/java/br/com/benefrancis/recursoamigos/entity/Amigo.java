package br.com.benefrancis.recursoamigos.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Amigo {
	@Id
	private Long id;

	private String nome;

	
}
