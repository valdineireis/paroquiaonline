package br.com.valdinei.paroquiaonline.controle;

import java.util.Calendar;
import java.util.List;

import br.com.valdinei.paroquiaonline.modelo.Publicacao;
import br.com.valdinei.paroquiaonline.repositorio.PublicacaoRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class PublicacaoController {

	private final Result result;
	private final PublicacaoRepository repository;
	
	private final Validator validator;
	
	public PublicacaoController(Result result, PublicacaoRepository repository, 
	Validator validator) {
		this.result = result;
		this.repository = repository;
	
		this.validator = validator;
	}
	
	@Get("/publicacoes")
	public List<Publicacao> index() {
		return repository.findAll();
	}
	
	@Post("/publicacoes")
	public void create(Publicacao publicacao) {
		validator.validate(publicacao);
		validator.onErrorUsePageOf(this).newPublicacao();
		
		publicacao.setDhCriada( Calendar.getInstance() );
		
		repository.create(publicacao);
		result.redirectTo(this).index();
	}
	
	@Get("/publicacoes/new")
	public Publicacao newPublicacao() {
		return new Publicacao();
	}
	
	@Put("/publicacoes")
	public void update(Publicacao publicacao) {
		validator.validate(publicacao);
		validator.onErrorUsePageOf(this).edit(publicacao);
		
		Publicacao find = repository.find(publicacao.getId());
		publicacao.setDhCriada(find.getDhCriada());
		
		repository.update(publicacao);
		result.redirectTo(this).index();
	}
	
	@Get("/publicacoes/{publicacao.id}/edit")
	public Publicacao edit(Publicacao publicacao) {
		
		return repository.find(publicacao.getId());
	}

	@Get("/publicacoes/{publicacao.id}")
	public Publicacao show(Publicacao publicacao) {
		return repository.find(publicacao.getId());
	}

	@Delete("/publicacoes/{publicacao.id}")
	public void destroy(Publicacao publicacao) {
		repository.destroy(repository.find(publicacao.getId()));
		result.redirectTo(this).index();  
	}
}