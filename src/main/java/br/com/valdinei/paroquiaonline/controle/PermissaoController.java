package br.com.valdinei.paroquiaonline.controle;

import java.util.List;

import br.com.valdinei.paroquiaonline.modelo.Permissao;
import br.com.valdinei.paroquiaonline.repositorio.PermissaoRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class PermissaoController {

	private final Result result;
	private final PermissaoRepository repository;
	
	private final Validator validator;
	
	public PermissaoController(Result result, PermissaoRepository repository, 
	Validator validator) {
		this.result = result;
		this.repository = repository;
	
		this.validator = validator;
	}
	
	@Get("/permissaos")
	public List<Permissao> index() {
		return repository.findAll();
	}
	
	@Post("/permissaos")
	public void create(Permissao permissao) {
		validator.validate(permissao);
		validator.onErrorUsePageOf(this).newPermissao();
		repository.create(permissao);
		result.redirectTo(this).index();
	}
	
	@Get("/permissaos/new")
	public Permissao newPermissao() {
		return new Permissao();
	}
	
	@Put("/permissaos")
	public void update(Permissao permissao) {
		validator.validate(permissao);
		validator.onErrorUsePageOf(this).edit(permissao);
		repository.update(permissao);
		result.redirectTo(this).index();
	}
	
	@Get("/permissaos/{permissao.id}/edit")
	public Permissao edit(Permissao permissao) {
		
		return repository.find(permissao.getId());
	}

	@Get("/permissaos/{permissao.id}")
	public Permissao show(Permissao permissao) {
		return repository.find(permissao.getId());
	}

	@Delete("/permissaos/{permissao.id}")
	public void destroy(Permissao permissao) {
		repository.destroy(repository.find(permissao.getId()));
		result.redirectTo(this).index();  
	}
}