package br.com.valdinei.paroquiaonline.repositorio;

import java.util.List;

import br.com.valdinei.paroquiaonline.modelo.Comunidade;

public interface ComunidadeRepository {
	/*
	 * Delete the methods you don't want to expose
	 */
	 
	void create(Comunidade entity);
	
	Comunidade update(Comunidade entity);
	
	void destroy(Comunidade entity);
	
	Comunidade find(Long id);
	
	List<Comunidade> findAll();

}
