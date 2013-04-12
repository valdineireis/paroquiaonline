package br.com.valdinei.paroquiaonline.controle;

import java.util.List;

import br.com.valdinei.paroquiaonline.modelo.Perfil;
import br.com.valdinei.paroquiaonline.repositorio.PerfilRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class PerfilController {

	private final Result result;
	private final PerfilRepository repository;
	
	private final Validator validator;
	
	public PerfilController(Result result, PerfilRepository repository, 
	Validator validator) {
		this.result = result;
		this.repository = repository;
	
		this.validator = validator;
	}
	
	@Get("/perfils")
	public List<Perfil> index() {
		return repository.findAll();
	}
	
	@Post("/perfils")
	public void create(Perfil perfil) {
		validator.validate(perfil);
		validator.onErrorUsePageOf(this).newPerfil();
		repository.create(perfil);
		result.redirectTo(this).index();
	}
	
	@Get("/perfils/new")
	public Perfil newPerfil() {
		return new Perfil();
	}
	
	@Put("/perfils")
	public void update(Perfil perfil) {
		validator.validate(perfil);
		validator.onErrorUsePageOf(this).edit(perfil);
		repository.update(perfil);
		result.redirectTo(this).index();
	}
	
	@Get("/perfils/{perfil.id}/edit")
	public Perfil edit(Perfil perfil) {
		
		return repository.find(perfil.getId());
	}

	@Get("/perfils/{perfil.id}")
	public Perfil show(Perfil perfil) {
		return repository.find(perfil.getId());
	}

	@Delete("/perfils/{perfil.id}")
	public void destroy(Perfil perfil) {
		repository.destroy(repository.find(perfil.getId()));
		result.redirectTo(this).index();  
	}
}