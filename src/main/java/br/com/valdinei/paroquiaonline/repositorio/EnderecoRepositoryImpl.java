package br.com.valdinei.paroquiaonline.repositorio;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.valdinei.paroquiaonline.modelo.Endereco;

@Component
public class EnderecoRepositoryImpl
    extends Repository<Endereco, Long>
    implements EnderecoRepository {

	private LocalizacaoRepository localizacaoRepository;

	EnderecoRepositoryImpl(EntityManager entityManager, LocalizacaoRepository localizacaoRepository) {
		super(entityManager);
		this.localizacaoRepository = localizacaoRepository;
	}
	
	@Override
	public void create(Endereco entity) {
		localizacaoRepository.create(entity.getLocalizacao());
		super.create(entity);
	}
	
	@Override
	public Endereco update(Endereco entity) {
		localizacaoRepository.update(entity.getLocalizacao());
		return super.update(entity);
	}
}
