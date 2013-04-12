package br.com.valdinei.paroquiaonline.repositorio;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.valdinei.paroquiaonline.modelo.Permissao;

@Component
public class PermissaoRepositoryImpl
    extends Repository<Permissao, Long>
    implements PermissaoRepository {

	PermissaoRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}
}
