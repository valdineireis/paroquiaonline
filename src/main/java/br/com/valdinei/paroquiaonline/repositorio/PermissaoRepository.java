package br.com.valdinei.paroquiaonline.repositorio;

import java.util.List;

import br.com.valdinei.paroquiaonline.modelo.Permissao;

public interface PermissaoRepository {
	/*
	 * Delete the methods you don't want to expose
	 */
	 
	void create(Permissao entity);
	
	Permissao update(Permissao entity);
	
	void destroy(Permissao entity);
	
	Permissao find(Long id);
	
	List<Permissao> findAll();

}
