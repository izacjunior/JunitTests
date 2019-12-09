package exercicio5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PrePosCondicaoClasse {

	
	@Test
	public void teste() {
		System.out.println("Testes");
		
	}
	
	@Test
	public void testeDois() {
		System.out.println("Testes 2");
		
	}
	
	@BeforeClass
	public static void setupClass() {
		System.out.println("Pre condicao Class");
	}
	
	@Before
	public void setup() {
		System.out.println("Pre condicao");
	}
	
	
	@After
	public void tearDown() {
		System.out.println("Pos condicao");
	}
	
	@AfterClass
	public static void tearDownClass() {
		System.out.println("Pos condicao Class");
	}
}
	
	
	

