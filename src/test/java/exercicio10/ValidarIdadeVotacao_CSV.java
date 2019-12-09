package exercicio10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import exercicio7.Votacao;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;

@RunWith(JUnitParamsRunner.class)
public class ValidarIdadeVotacao_CSV {

	@Test
	@FileParameters(value = "src/test/java/exercicio10/massa_dados.csv", mapper = CsvWithHeaderMapper.class)
	public void validarVoto(String nome, int anoDeNascimento, String resultado) {

		assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
		
		
	}

}
