package br.com.benefrancis.recursoamigos.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;

import lombok.Data;

@Data
@Entity
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	@ManyToOne(fetch = FetchType.EAGER)
	private TipoEvento tipo;

	private String nome;

	private String descricao;

	@Temporal(TemporalType.DATE)
	private Date data;

	private String hora;

	
	@ManyToMany(fetch = FetchType.EAGER, targetEntity = Amigo.class)
	private List<Amigo> convidados;
}
