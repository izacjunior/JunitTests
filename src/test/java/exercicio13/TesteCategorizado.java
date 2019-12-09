package exercicio13;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorias.Positivos;
import categorias.Smoke;

public class TesteCategorizado {

	
	@Test
	@Category(Smoke.class)
	public void teste1() {
		
	}
	
	
	@Test
	@Category(Positivos.class)
	public void teste2() {
		
	}
	
	@Test
	//@Category(Smoke.class)
	public void teste3() {
		
	}
	
}
