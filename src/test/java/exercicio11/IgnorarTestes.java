package exercicio11;

import org.junit.Ignore;
import org.junit.Test;

public class IgnorarTestes {

	@Test(timeout = 1000)
	public void teste1() {

	}
	
	@Test(timeout = 1000)
	public void teste2() throws InterruptedException {
		Thread.sleep(2000);
	}

	@Test
	@Ignore
	public void testeIgnorado() {

	}

	@Test
	@Ignore(value = "Teste ignorado para testes")
	public void testeIgnoradoJustificativa() {

	}
}
