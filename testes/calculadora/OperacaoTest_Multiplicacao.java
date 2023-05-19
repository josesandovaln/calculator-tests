package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperacaoTest_Multiplicacao {

	Operacao resul = new Operacao();
	
	@Test
	public void testMultiplicacaoUm() {
		
		double multipicacao = resul.multiplicacao(40, 80);
		assertEquals(3200, multipicacao);
				
	}
	
	@Test
	public void testMultiplicacaoDois() {
		
		double multiplicacao = resul.multiplicacao(135, 49);
		assertEquals(6615, multiplicacao);
		
	}
	
	@Test
	public void testMultplicacaoTres() {
		
		double multiplicacao = resul.multiplicacao(33, 33);
		assertEquals(1089, multiplicacao);
		
	}
	
	@Test
	public void testMultiplicacaoQuatro() {
		
		double multiplicacao = resul.multiplicacao(931, 5);
		assertEquals(4655, multiplicacao);
		
	}
	
	@Test
	public void testMultiplicacaoCinco() {
		
		double multiplicacao = resul.multiplicacao(4569, 987);
		assertEquals(4509603, multiplicacao);
	}

}
