package br.com.valdinei.paroquiaonline.interceptador;

import javax.servlet.http.HttpServletResponse;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.caelum.vraptor.resource.ResourceMethod;
import br.com.valdinei.paroquiaonline.anotacao.NoCache;

@Intercepts(before=AutenticacaoInterceptor.class)
public class NoCacheInterceptor implements Interceptor {

	private final HttpServletResponse response;
	
	public NoCacheInterceptor(HttpServletResponse response) {
        this.response = response;
    }
	
	public boolean accepts(ResourceMethod method) {
//		return true; // allow all requests
//		return method.containsAnnotation(NoCache.class);
		return method.getMethod().isAnnotationPresent(NoCache.class) || 
				method.getResource().getType().isAnnotationPresent(NoCache.class);
	}

	public void intercept(InterceptorStack stack, ResourceMethod method,
			Object resourceInstance) throws InterceptionException {
		// set the expires to past
        response.setHeader("Expires", "Wed, 31 Dec 1969 21:00:00 GMT");

        // no-cache headers for HTTP/1.1
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");

        // no-cache headers for HTTP/1.1 (IE)
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");

        // no-cache headers for HTTP/1.0
        response.setHeader("Pragma", "no-cache");
        
        stack.next(method, resourceInstance);
	}

}
