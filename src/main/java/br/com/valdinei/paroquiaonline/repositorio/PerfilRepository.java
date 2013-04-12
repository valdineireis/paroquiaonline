package br.com.valdinei.paroquiaonline.repositorio;

import java.util.List;

import br.com.valdinei.paroquiaonline.modelo.Perfil;

public interface PerfilRepository {
	/*
	 * Delete the methods you don't want to expose
	 */
	 
	void create(Perfil entity);
	
	Perfil update(Perfil entity);
	
	void destroy(Perfil entity);
	
	Perfil find(Long id);
	
	List<Perfil> findAll();

}
