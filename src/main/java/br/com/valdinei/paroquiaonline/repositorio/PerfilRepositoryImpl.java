package br.com.valdinei.paroquiaonline.repositorio;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.valdinei.paroquiaonline.modelo.Perfil;

@Component
public class PerfilRepositoryImpl
    extends Repository<Perfil, Long>
    implements PerfilRepository {

	PerfilRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}
}
