package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperacaoTest_Divisao {

	Operacao resul = new Operacao();
	
	@Test
	public void testDivisaoUm() {
		
		double divisao = resul.divisao(60, 5);
		assertEquals(12, divisao);
		
	}
	
	@Test
	public void testDivisaoDois() {
		
		double divisao = resul.divisao(197, 34);
		assertEquals(5.794117647058823, divisao);
		
	}
	
	@Test
	public void testDivisaoTres() {
		
		double divisao = resul.divisao(32, 7);
		assertEquals(4.571428571428571, divisao);
		
	}
	
	@Test
	public void testDivisaoQuatro() {
		
		double divisao = resul.divisao(16, 4);
		assertEquals(4, divisao);
		
	}
	
	@Test
	public void testDivisaoCinco() {
		
		double divisao = resul.divisao(10, 2);
		assertEquals(5, divisao);
	}

}
