package br.com.valdinei.paroquiaonline.repositorio;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class EnderecoRepositoryImplTest {
	
    @Test public void fakeTest() {
  		assertNotNull("put something real.", new EnderecoRepositoryImpl(null, null));
  	}
}

