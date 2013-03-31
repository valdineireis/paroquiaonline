package br.com.valdinei.paroquiaonline.controle;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class EnderecoControllerTest {

	@Test public void fakeTest() {
		assertNotNull("put something real.", new EnderecoController(null, null, null));
 	}
}
