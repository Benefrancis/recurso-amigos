package br.com.benefrancis.recursoamigos.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Evento {

	@Id
	private Long id;

	@ManyToOne
	private TipoEvento tipo;

	private String nome;

	private String descricao;

	@Temporal(TemporalType.DATE)
	private Date data;

	@Temporal(TemporalType.TIME)
	private Date hora;

	@ManyToMany(fetch = FetchType.EAGER)
	private List<Amigo> convidados;
}
