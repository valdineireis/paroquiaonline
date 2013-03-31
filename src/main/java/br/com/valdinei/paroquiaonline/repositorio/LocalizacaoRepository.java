package br.com.valdinei.paroquiaonline.repositorio;

import java.util.List;

import br.com.valdinei.paroquiaonline.modelo.Localizacao;

public interface LocalizacaoRepository {
	/*
	 * Delete the methods you don't want to expose
	 */
	 
	void create(Localizacao entity);
	
	Localizacao update(Localizacao entity);
	
	void destroy(Localizacao entity);
	
	Localizacao find(Long id);
	
	List<Localizacao> findAll();

}
