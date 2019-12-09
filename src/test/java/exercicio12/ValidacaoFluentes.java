package exercicio12;

import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ValidacaoFluentes {

	@Test
	public void validacaoEqualsTo() {
		String produto = "TV 40";
		assertThat(produto, equalTo("TV 40"));
	}

	@Test
	public void validacaoIs() {
		int codigo = 50;
		assertThat(codigo, is(50));
	}

	@Test
	public void validacaoAnyOf() {
		String resultado = "A COR E VERMELHA";
		assertThat(resultado, anyOf(containsString("VERMELHA"), containsString("VERMELHO")));
	}

	@Test
	public void validacaoHasItem() {

		List<String> lista = new ArrayList<String>();
		lista.add("CELULAR");
		lista.add("adaptador");
		lista.add("TV");

		assertThat(lista, hasItem("CELULAR"));

	}

}
