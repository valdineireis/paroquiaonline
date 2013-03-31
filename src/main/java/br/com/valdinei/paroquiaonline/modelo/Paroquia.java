package br.com.valdinei.paroquiaonline.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@javax.persistence.Entity
public class Paroquia extends Entity {

	@Column(length = 200, nullable = false)
	private String nome;
	
	@OneToOne
	private Endereco endereco;
	
	@OneToMany(mappedBy = "paroquia")
	private List<Comunidade> comunidades;

	@OneToMany(mappedBy = "paroquia")
	private List<Publicacao> publicacoes;
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Comunidade> getComunidades() {
		return comunidades;
	}

	public void setComunidades(List<Comunidade> comunidades) {
		this.comunidades = comunidades;
	}

	public List<Publicacao> getPublicacoes() {
		return publicacoes;
	}

	public void setPublicacoes(List<Publicacao> publicacoes) {
		this.publicacoes = publicacoes;
	}

}
