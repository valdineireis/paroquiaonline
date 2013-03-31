package br.com.valdinei.paroquiaonline.modelo;

import javax.persistence.Column;
import javax.persistence.OneToOne;

@javax.persistence.Entity
public class Localizacao extends Entity {

	@Column(length = 100)
	private String x;
	
	@Column(length = 100)
	private String y;
	
	@OneToOne(mappedBy = "localizacao")
	private Endereco endereco;

	public void setX(String x) {
		this.x = x;
	}

	public String getX() {
		return x;
	}

	public void setY(String y) {
		this.y = y;
	}

	public String getY() {
		return y;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
