package br.com.valdinei.paroquiaonline.repositorio;

import java.util.List;

import br.com.valdinei.paroquiaonline.modelo.Endereco;

public interface EnderecoRepository {
	/*
	 * Delete the methods you don't want to expose
	 */
	 
	void create(Endereco entity);
	
	Endereco update(Endereco entity);
	
	void destroy(Endereco entity);
	
	Endereco find(Long id);
	
	List<Endereco> findAll();

}
