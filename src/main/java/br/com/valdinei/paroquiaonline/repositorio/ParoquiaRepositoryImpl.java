package br.com.valdinei.paroquiaonline.repositorio;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.valdinei.paroquiaonline.modelo.Paroquia;

@Component
public class ParoquiaRepositoryImpl
    extends Repository<Paroquia, Long>
    implements ParoquiaRepository {

	private EnderecoRepository enderecoRepository;

	ParoquiaRepositoryImpl(EntityManager entityManager, EnderecoRepository enderecoRepository) {
		super(entityManager);
		this.enderecoRepository = enderecoRepository;
	}
	
	@Override
	public void create(Paroquia entity) {
		enderecoRepository.create(entity.getEndereco());
		super.create(entity);
	}
	
	@Override
	public Paroquia update(Paroquia entity) {
		enderecoRepository.update(entity.getEndereco());
		return super.update(entity);
	}
}
