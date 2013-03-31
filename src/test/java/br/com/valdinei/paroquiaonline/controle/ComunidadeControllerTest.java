package br.com.valdinei.paroquiaonline.controle;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ComunidadeControllerTest {

	@Test public void fakeTest() {
		assertNotNull("put something real.", new ComunidadeController(null, null, null, null));
 	}
}
