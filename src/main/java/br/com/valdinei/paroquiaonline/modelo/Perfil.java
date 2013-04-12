package br.com.valdinei.paroquiaonline.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@javax.persistence.Entity
public class Perfil extends Entity {

	private String nome;

	@NotNull
	@OneToMany(mappedBy = "perfil", cascade = CascadeType.REMOVE)
	private List<Usuario> usuarios;
	
	@JoinTable(name = "perfilpermissao", joinColumns = {
        @JoinColumn(name = "idPerfil", referencedColumnName = "id", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "idPermissao", referencedColumnName = "id", nullable = false)})
    @ManyToMany
	private List<Permissao> permissoes;
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Permissao> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}

}
