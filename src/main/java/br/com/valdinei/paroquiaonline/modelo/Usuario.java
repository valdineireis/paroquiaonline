package br.com.valdinei.paroquiaonline.modelo;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@javax.persistence.Entity
public class Usuario extends Entity {

	private String login;
	private String senha;

	@NotNull
	@ManyToOne
	private Perfil perfil;
	
	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

}
