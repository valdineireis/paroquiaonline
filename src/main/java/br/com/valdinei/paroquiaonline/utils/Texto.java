package br.com.valdinei.paroquiaonline.utils;

import java.text.Normalizer;

/**
 * 
 * @author Valdinei Reis da Silva
 * @since 2013-03-25
 *
 */
public class Texto {

	/**
	 * Substitui os caracteres especiaos para seu equivalente.
	 * @param texto
	 * @return 
	 * ãâàáä = a; <br/>
	 * êèéë = e; <br/>
	 * îìíï = i; <br/>
	 * õôòóö = o; <br/>
	 * ûúùü = u; <br/>
	 * ç = c; <br/>ñ = n
	 */
	public static String trocaCaracteresEspeciais(String texto) {
		String temp = Normalizer.normalize(texto, java.text.Normalizer.Form.NFD);  
	    return temp.replaceAll("[^\\p{ASCII}]","");
	}
	
	/**
	 * Mantem os caracteres de a-z A-Z 0-9 e espaços em branco, removendo os demais.
	 * @param texto
	 * @return
	 */
	public static String removePontuacao(String texto) {
		return texto.replaceAll("[^a-zA-Z0-9\\s]", "");
	}
	
	/**
	 * Formata o texto para melhor visualização na barra de endereços.
	 * @param texto
	 * @return Exemplo: <br/>
	 * texto com melhor visualização = texto-com-melhor-visualizacao
	 */
	public static String formataUrl(String texto) {
		String temp = trocaCaracteresEspeciais(texto);
		temp 		= removePontuacao(temp);
		return temp.trim()
				   .replaceAll("[\\s]", "-")
				   .toLowerCase();
	}
	
}
