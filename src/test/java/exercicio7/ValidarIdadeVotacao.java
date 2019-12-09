package exercicio7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidarIdadeVotacao {

	@Test
	public void idade15anos_NaoPodeVotar() {

		assertEquals("Maria seu voto e facultativo", Votacao.podeVotar("Maria", 2003));

	}

	@Test
	public void idade16anos_VotoFacultativo() {

		assertEquals("Rodrigo seu voto e facultativo", Votacao.podeVotar("Rodrigo", 2002));

	}

	@Test
	public void idade17anos_VotoFacultativo() {

		assertEquals("Joao seu voto e obrigatorio", Votacao.podeVotar("Joao", 2001));

	}

	@Test
	public void idade18anos_VotoObrigatorio() {

		assertEquals("Carla seu voto e obrigatorio", Votacao.podeVotar("Carla", 2000));

	}

	@Test
	public void idade25anos_VotoObrigatorio() {

		assertEquals("Jose seu voto e obrigatorio", Votacao.podeVotar("Jose", 1993));

	}

	@Test
	public void idade70anos_VotoObrigatorio() {

		assertEquals("Ana seu voto e facultativo", Votacao.podeVotar("Ana", 1948));

	}

	@Test
	public void idade71anos_VotoFacultativo() {

		assertEquals("Jose seu voto e facultativo", Votacao.podeVotar("Jose", 1947));

	}
}
