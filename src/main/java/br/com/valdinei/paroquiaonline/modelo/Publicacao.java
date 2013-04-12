package br.com.valdinei.paroquiaonline.modelo;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.valdinei.paroquiaonline.utils.Texto;

@javax.persistence.Entity
public class Publicacao extends Entity {

	@NotEmpty
	@Column(nullable = false, length = 200)
	private String titulo;
	
	@NotEmpty
	@Column(nullable = false, length = 255)
	private String chamada;

	@Lob
	@NotEmpty
	@Column(nullable = false, length = 65535)
	private String conteudo;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dhCriada;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dhPublicada;
	
	private boolean snPublicada;
	
	@Column(length = 150)
	private String imagem;
	
	private String tags;

	@ManyToOne
	private Paroquia paroquia;
	
	@ManyToOne
	private Comunidade comunidade;
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setChamada(String chamada) {
		this.chamada = chamada;
	}

	public String getChamada() {
		return chamada;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setDhCriada(Calendar dhCriada) {
		this.dhCriada = dhCriada;
	}

	public Calendar getDhCriada() {
		return dhCriada;
	}

	public void setDhPublicada(Calendar dhPublicada) {
		this.dhPublicada = dhPublicada;
	}

	public Calendar getDhPublicada() {
		return dhPublicada;
	}

	public void setSnPublicada(boolean snPublicada) {
		this.snPublicada = snPublicada;
	}

	public boolean isSnPublicada() {
		return snPublicada;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getImagem() {
		return imagem;
	}

	public Paroquia getParoquia() {
		return paroquia;
	}

	public void setParoquia(Paroquia paroquia) {
		this.paroquia = paroquia;
	}

	public Comunidade getComunidade() {
		return comunidade;
	}

	public void setComunidade(Comunidade comunidade) {
		this.comunidade = comunidade;
	}
	
	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	@Transient
	public String getTituloUrl() {
		return Texto.formataUrl( getTitulo() );
	}

}
