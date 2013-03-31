package br.com.valdinei.paroquiaonline.repositorio;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.valdinei.paroquiaonline.modelo.Publicacao;

@Component
public class PublicacaoRepositoryImpl
    extends Repository<Publicacao, Long>
    implements PublicacaoRepository {

	PublicacaoRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}
}
