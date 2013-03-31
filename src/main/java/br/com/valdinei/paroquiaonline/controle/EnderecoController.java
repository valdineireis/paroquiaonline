package br.com.valdinei.paroquiaonline.controle;

import java.util.List;

import br.com.valdinei.paroquiaonline.modelo.Endereco;
import br.com.valdinei.paroquiaonline.repositorio.EnderecoRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class EnderecoController {

	private final Result result;
	private final EnderecoRepository repository;
	
	private final Validator validator;
	
	public EnderecoController(Result result, EnderecoRepository repository, 
	Validator validator) {
		this.result = result;
		this.repository = repository;
	
		this.validator = validator;
	}
	
	@Get("/enderecos")
	public List<Endereco> index() {
		return repository.findAll();
	}
	
	@Post("/enderecos")
	public void create(Endereco endereco) {
		validator.validate(endereco);
		validator.onErrorUsePageOf(this).newEndereco();
		repository.create(endereco);
		result.redirectTo(this).index();
	}
	
	@Get("/enderecos/new")
	public Endereco newEndereco() {
		return new Endereco();
	}
	
	@Put("/enderecos")
	public void update(Endereco endereco) {
		validator.validate(endereco);
		validator.onErrorUsePageOf(this).edit(endereco);
		repository.update(endereco);
		result.redirectTo(this).index();
	}
	
	@Get("/enderecos/{endereco.id}/edit")
	public Endereco edit(Endereco endereco) {
		
		return repository.find(endereco.getId());
	}

	@Get("/enderecos/{endereco.id}")
	public Endereco show(Endereco endereco) {
		return repository.find(endereco.getId());
	}

	@Delete("/enderecos/{endereco.id}")
	public void destroy(Endereco endereco) {
		repository.destroy(repository.find(endereco.getId()));
		result.redirectTo(this).index();  
	}
}