package br.com.valdinei.paroquiaonline.controle;

import java.util.List;

import br.com.valdinei.paroquiaonline.modelo.Comunidade;
import br.com.valdinei.paroquiaonline.repositorio.ComunidadeRepository;
import br.com.valdinei.paroquiaonline.repositorio.ParoquiaRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class ComunidadeController {

	private final Result result;
	private final ComunidadeRepository repository;
	
	private final Validator validator;
	private ParoquiaRepository paroquiaRepository;
	
	public ComunidadeController(Result result, ComunidadeRepository repository, 
	Validator validator, ParoquiaRepository paroquiaRepository) {
		this.result = result;
		this.repository = repository;
	
		this.validator = validator;
		this.paroquiaRepository = paroquiaRepository;
	}
	
	@Get("/comunidades")
	public List<Comunidade> index() {
		return repository.findAll();
	}
	
	@Post("/comunidades")
	public void create(Comunidade comunidade) {
		validator.validate(comunidade);
		validator.onErrorUsePageOf(this).newComunidade();
		repository.create(comunidade);
		result.redirectTo(this).index();
	}
	
	@Get("/comunidades/new")
	public Comunidade newComunidade() {
		result.include("paroquiaList", paroquiaRepository.findAll());
		return new Comunidade();
	}
	
	@Put("/comunidades")
	public void update(Comunidade comunidade) {
		validator.validate(comunidade);
		validator.onErrorUsePageOf(this).edit(comunidade);
		repository.update(comunidade);
		result.redirectTo(this).index();
	}
	
	@Get("/comunidades/{comunidade.id}/edit")
	public Comunidade edit(Comunidade comunidade) {
		result.include("paroquiaList", paroquiaRepository.findAll());
		return repository.find(comunidade.getId());
	}

	@Get("/comunidades/{comunidade.id}")
	public Comunidade show(Comunidade comunidade) {
		return repository.find(comunidade.getId());
	}

	@Delete("/comunidades/{comunidade.id}")
	public void destroy(Comunidade comunidade) {
		repository.destroy(repository.find(comunidade.getId()));
		result.redirectTo(this).index();  
	}
}