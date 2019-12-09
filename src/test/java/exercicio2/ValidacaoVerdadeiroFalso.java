package exercicio2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidacaoVerdadeiroFalso {

	@Test
	public void verdadeiroSucesso() {

		boolean campoPresente = true;
		assertTrue(campoPresente);
	}

	@Test
	public void verdadeiroSucesso_Falha() {
		
		boolean campoPresente = true;
		assertFalse(campoPresente);
		
	}
	
}
