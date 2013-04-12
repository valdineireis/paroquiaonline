package br.com.valdinei.paroquiaonline.componente;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;
import br.com.valdinei.paroquiaonline.modelo.Permissao;
import br.com.valdinei.paroquiaonline.modelo.Usuario;

@Component
@SessionScoped
public class UserSession implements Serializable {

	private static final long serialVersionUID = 6322859725714022137L;

	private Usuario usuario;
	private List<String> permissoes;

	private HttpSession httpSession;

	public UserSession(HttpSession httpSession) {
		this.httpSession = httpSession;
	}
	
	public void login(Usuario usuario) {
//		this.logout();
		this.usuario = usuario;
		permissoes = new ArrayList<String>();
		
		if (usuario != null && usuario.getPerfil() != null) {
			for (Permissao role : usuario.getPerfil().getPermissoes()) {
				this.permissoes.add( role.getChave() );
			}
		}
	}
	
	public boolean isLogged() {
		return usuario != null;
	}

	public void logout() {
		usuario = null;
		permissoes = null;
		httpSession.invalidate();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public List<String> getPermissoes() {
		return permissoes;
	}
	
}
