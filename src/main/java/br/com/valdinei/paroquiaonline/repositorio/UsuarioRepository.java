package br.com.valdinei.paroquiaonline.repositorio;

import java.util.List;

import br.com.valdinei.paroquiaonline.modelo.Usuario;

public interface UsuarioRepository {
	/*
	 * Delete the methods you don't want to expose
	 */
	 
	void create(Usuario entity);
	
	Usuario update(Usuario entity);
	
	void destroy(Usuario entity);
	
	Usuario find(Long id);
	
	List<Usuario> findAll();

}
