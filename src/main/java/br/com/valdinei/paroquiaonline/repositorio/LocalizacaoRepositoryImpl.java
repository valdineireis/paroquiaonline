package br.com.valdinei.paroquiaonline.repositorio;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.valdinei.paroquiaonline.modelo.Localizacao;

@Component
public class LocalizacaoRepositoryImpl
    extends Repository<Localizacao, Long>
    implements LocalizacaoRepository {

	LocalizacaoRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}
}
