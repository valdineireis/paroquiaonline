package br.com.valdinei.paroquiaonline.controle;

import java.util.List;

import br.com.valdinei.paroquiaonline.modelo.Localizacao;
import br.com.valdinei.paroquiaonline.repositorio.LocalizacaoRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class LocalizacaoController {

	private final Result result;
	private final LocalizacaoRepository repository;
	
	private final Validator validator;
	
	public LocalizacaoController(Result result, LocalizacaoRepository repository, 
	Validator validator) {
		this.result = result;
		this.repository = repository;
	
		this.validator = validator;
	}
	
	@Get("/localizacoes")
	public List<Localizacao> index() {
		return repository.findAll();
	}
	
	@Post("/localizacoes")
	public void create(Localizacao localizacao) {
		validator.validate(localizacao);
		validator.onErrorUsePageOf(this).newLocalizacao();
		repository.create(localizacao);
		result.redirectTo(this).index();
	}
	
	@Get("/localizacoes/new")
	public Localizacao newLocalizacao() {
		return new Localizacao();
	}
	
	@Put("/localizacoes")
	public void update(Localizacao localizacao) {
		validator.validate(localizacao);
		validator.onErrorUsePageOf(this).edit(localizacao);
		repository.update(localizacao);
		result.redirectTo(this).index();
	}
	
	@Get("/localizacoes/{localizacao.id}/edit")
	public Localizacao edit(Localizacao localizacao) {
		
		return repository.find(localizacao.getId());
	}

	@Get("/localizacoes/{localizacao.id}")
	public Localizacao show(Localizacao localizacao) {
		return repository.find(localizacao.getId());
	}

	@Delete("/localizacoes/{localizacao.id}")
	public void destroy(Localizacao localizacao) {
		repository.destroy(repository.find(localizacao.getId()));
		result.redirectTo(this).index();  
	}
}