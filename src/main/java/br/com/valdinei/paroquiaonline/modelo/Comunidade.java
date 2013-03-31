package br.com.valdinei.paroquiaonline.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotEmpty;

@javax.persistence.Entity
public class Comunidade extends Entity {

	@NotEmpty
	@Column(nullable = false, length = 200)
	private String nome;
	
	@ManyToOne(optional = false)
	private Paroquia paroquia;
	
	@OneToOne(optional = false)
	private Endereco endereco;
	
	@OneToMany(mappedBy = "comunidade")
	private List<Publicacao> publicacoes;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public Paroquia getParoquia() {
		return paroquia;
	}

	public void setParoquia(Paroquia paroquia) {
		this.paroquia = paroquia;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Publicacao> getPublicacoes() {
		return publicacoes;
	}

	public void setPublicacoes(List<Publicacao> publicacoes) {
		this.publicacoes = publicacoes;
	}

}
