package br.com.valdinei.paroquiaonline.modelo;

import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@javax.persistence.Entity
public class Permissao extends Entity {

	private String chave;
	private String descricao;

	@JoinTable(name = "perfilpermissao", joinColumns = {
        @JoinColumn(name = "idPermissao", referencedColumnName = "id", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "idPerfil", referencedColumnName = "id", nullable = false)})
    @ManyToMany
    private List<Perfil> perfils;
	
	public void setChave(String chave) {
		this.chave = chave;
	}

	public String getChave() {
		return chave;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
