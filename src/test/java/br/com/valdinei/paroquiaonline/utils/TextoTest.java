package br.com.valdinei.paroquiaonline.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class TextoTest {

	@Test
	public void deveriaNormalizarNoPadraoASCII() {
		// given
		String texto = "!@#$%*()_-+={[}]º^~:;>.<,/?°|\\\"''`¢";
		
		// when
		String novoTexto = Texto.trocaCaracteresEspeciais(texto);
		
		// then
		assertEquals("!@#$%*()_-+={[}]^~:;>.<,/?|\\\"''`", novoTexto);
	}
	
	@Test
	public void deveriaSubstituirOsCaracteresEspeciais() {
		// given
		String caracteres = "ãâàáäêèéëîìíïõôòóöûúùüÃÂÀÁÄÊÈÉËÎÌÍÏÕÔÒÓÖÛÙÚÜçÇñÑ";
		
		// when
		String novoTexto = Texto.trocaCaracteresEspeciais(caracteres);
		
		// then
		assertEquals("aaaaaeeeeiiiiooooouuuuAAAAAEEEEIIIIOOOOOUUUUcCnN", novoTexto);
	}
	
	@Test
	public void deveriaManterOsCaracteresNumericos() {
		// given
		String numeros = "0123456789";
		
		// when
		String novoTexto = Texto.trocaCaracteresEspeciais(numeros);
		
		// then
		assertEquals("0123456789", novoTexto);
	}
	
	@Test
	public void deveriaManterApenasOsCaracteresDeAaZeNumeros() {
		// given
		String texto = "_!@#$%*()-+={[}]^~:;>.<,/?|\\\"''`";
		
		// when
		String novoTexto = Texto.removePontuacao(texto);
		
		// then
		assertEquals("", novoTexto);
	}
	
	@Test
	public void deveriaManterEspacoEmBranco() {
		// given
		String texto = " abc 012 ";
		
		// when
		String novoTexto = Texto.removePontuacao(texto);
		
		// then
		assertEquals(" abc 012 ", novoTexto);
	}
	
	@Test
	public void deveriaFormatarUrl() {
		// given
		String texto = " 0123456789 qwertyuiopasdfghjklçzxcvbnmQWERTYUIOPASDFGHJKLÇZXCVBNM_!@#$%*()-+={[}]^~:;>.<,/?|\\\"''` ";
		
		// when
		String novoTexto = Texto.formataUrl(texto);
		String formatado = Texto.formataUrl("texto com melhor visualização");
		
		// then
		assertEquals("0123456789-qwertyuiopasdfghjklczxcvbnmqwertyuiopasdfghjklczxcvbnm", novoTexto);
		assertEquals("texto-com-melhor-visualizacao", formatado);
	}

}
