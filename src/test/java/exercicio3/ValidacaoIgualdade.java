package exercicio3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidacaoIgualdade {
	
	@Test
	public void validacaoIgualdade() {
		
		String resultado = "Registro com sucesso";
		assertEquals("Registro com sucesso", resultado);
	}
	
	@Test
	public void validacaoIgualdadeFalha() {
		
		String resultado = "Registro com sucesso!";
		assertEquals("Registro com sucesso", resultado);
	}

}
