package br.com.valdinei.paroquiaonline.controle;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ParoquiaControllerTest {

	@Test public void fakeTest() {
		assertNotNull("put something real.", new ParoquiaController(null, null, null));
 	}
}
