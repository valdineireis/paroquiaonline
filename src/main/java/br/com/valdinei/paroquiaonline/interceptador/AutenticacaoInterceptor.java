package br.com.valdinei.paroquiaonline.interceptador;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.caelum.vraptor.resource.ResourceMethod;
import br.com.valdinei.paroquiaonline.anotacao.Permission;
import br.com.valdinei.paroquiaonline.componente.UserSession;

@Intercepts
public class AutenticacaoInterceptor implements Interceptor {

	private final UserSession usuario;
	private final Result result;

	public AutenticacaoInterceptor(UserSession usuario, Result result) {
		this.usuario = usuario;
		this.result = result;
	}

	public boolean accepts(ResourceMethod method) {
		return !this.usuario.isLogged() && 
				(method.containsAnnotation(Permission.class) || 
					method.getResource().getType().isAnnotationPresent(Permission.class));
	}

	public void intercept(InterceptorStack stack, ResourceMethod method,
			Object resourceInstance) throws InterceptionException {
		// TODO implementar tela de login
		//result.redirectTo(IndexController.class).login(new Usuario());
	}

}
