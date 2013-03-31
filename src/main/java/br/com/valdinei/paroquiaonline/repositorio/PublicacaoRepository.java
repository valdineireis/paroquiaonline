package br.com.valdinei.paroquiaonline.repositorio;

import java.util.List;

import br.com.valdinei.paroquiaonline.modelo.Publicacao;

public interface PublicacaoRepository {
	/*
	 * Delete the methods you don't want to expose
	 */
	 
	void create(Publicacao entity);
	
	Publicacao update(Publicacao entity);
	
	void destroy(Publicacao entity);
	
	Publicacao find(Long id);
	
	List<Publicacao> findAll();

}
