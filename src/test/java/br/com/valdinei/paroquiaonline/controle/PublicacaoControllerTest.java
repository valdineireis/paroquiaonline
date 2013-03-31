package br.com.valdinei.paroquiaonline.controle;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PublicacaoControllerTest {

	@Test public void fakeTest() {
		assertNotNull("put something real.", new PublicacaoController(null, null, null));
 	}
}
