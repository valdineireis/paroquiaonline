package br.com.valdinei.paroquiaonline.controle;

import java.util.List;

import br.com.valdinei.paroquiaonline.modelo.Usuario;
import br.com.valdinei.paroquiaonline.repositorio.UsuarioRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class UsuarioController {

	private final Result result;
	private final UsuarioRepository repository;
	
	private final Validator validator;
	
	public UsuarioController(Result result, UsuarioRepository repository, 
	Validator validator) {
		this.result = result;
		this.repository = repository;
	
		this.validator = validator;
	}
	
	@Get("/usuarios")
	public List<Usuario> index() {
		return repository.findAll();
	}
	
	@Post("/usuarios")
	public void create(Usuario usuario) {
		validator.validate(usuario);
		validator.onErrorUsePageOf(this).newUsuario();
		repository.create(usuario);
		result.redirectTo(this).index();
	}
	
	@Get("/usuarios/new")
	public Usuario newUsuario() {
		return new Usuario();
	}
	
	@Put("/usuarios")
	public void update(Usuario usuario) {
		validator.validate(usuario);
		validator.onErrorUsePageOf(this).edit(usuario);
		repository.update(usuario);
		result.redirectTo(this).index();
	}
	
	@Get("/usuarios/{usuario.id}/edit")
	public Usuario edit(Usuario usuario) {
		
		return repository.find(usuario.getId());
	}

	@Get("/usuarios/{usuario.id}")
	public Usuario show(Usuario usuario) {
		return repository.find(usuario.getId());
	}

	@Delete("/usuarios/{usuario.id}")
	public void destroy(Usuario usuario) {
		repository.destroy(repository.find(usuario.getId()));
		result.redirectTo(this).index();  
	}
}