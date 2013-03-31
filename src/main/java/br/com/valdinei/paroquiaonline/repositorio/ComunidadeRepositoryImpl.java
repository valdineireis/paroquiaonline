package br.com.valdinei.paroquiaonline.repositorio;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.valdinei.paroquiaonline.modelo.Comunidade;

@Component
public class ComunidadeRepositoryImpl
    extends Repository<Comunidade, Long>
    implements ComunidadeRepository {

	private EnderecoRepository enderecoRepository;

	ComunidadeRepositoryImpl(EntityManager entityManager, EnderecoRepository enderecoRepository) {
		super(entityManager);
		this.enderecoRepository = enderecoRepository;
	}
	
	@Override
	public void create(Comunidade entity) {
		enderecoRepository.create(entity.getEndereco());
		super.create(entity);
	}
	
	@Override
	public Comunidade update(Comunidade entity) {
		enderecoRepository.update(entity.getEndereco());
		return super.update(entity);
	}
}
