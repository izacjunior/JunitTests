package exercicio4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrePosCondicaoTeste {

	
	@Test
	public void teste() {
		System.out.println("Testes");
		
	}
	
	@Test
	public void testeDois() {
		System.out.println("Testes 2");
		
	}
	
	@Before
	public void setup() {
		System.out.println("Pre condicao");
	}
	
	
	@After
	public void tearDown() {
		System.out.println("Pos condicao");
	}
}
