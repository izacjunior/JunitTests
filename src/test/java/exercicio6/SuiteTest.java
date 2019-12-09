package exercicio6;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import exercicio2.ValidacaoVerdadeiroFalso;
import exercicio3.ValidacaoIgualdade;
import exercicio4.PrePosCondicaoTeste;
import exercicio5.PrePosCondicaoClasse;

@RunWith(Suite.class)
@SuiteClasses({ ValidacaoVerdadeiroFalso.class, ValidacaoIgualdade.class, PrePosCondicaoTeste.class,
		PrePosCondicaoClasse.class })
public class SuiteTest {

}
