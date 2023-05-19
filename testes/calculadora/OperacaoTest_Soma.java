package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperacaoTest_Soma {

	Operacao resul = new Operacao();
	
	@Test
	public void testSomaUm() {
		
		double soma = resul.soma(5, 5);
		assertEquals(10, soma);
		
	}
	
	@Test
	public void testSomaDois() {
		
		double soma = resul.soma(6, 6);
		assertEquals(12, soma);
		
	}
	
	@Test
	public void testSomaTres() {
		
		double soma = resul.soma(197, 574);
		assertEquals(771, soma);
				
	}
	
	@Test
	public void testSomaQuatro() {
		
		double soma = resul.soma(-56, 27);
		assertEquals(-29, soma);
	}
	
	@Test
	public void testSomaCinco() {
		
		double soma = resul.soma(-985632, -979236);
		assertEquals(-1964868, soma);
		
	}
	
	@Test
	public void testSomaSeis() {
		
		double soma = resul.soma(50, 150);
		assertEquals(200, soma);
		
	}
	
	@Test
	public void testSomaSete() {
		
		double soma = resul.soma(742, 62);
		assertEquals(804, soma);
				
	}
	
	@Test
	public void testSomaOito() {
		
		double soma = resul.soma(23, 60);
		assertEquals(83, soma);
	}
	
	@Test
	public void testSomaNove() {
		
		double soma = resul.soma(0, 0);
		assertEquals(0, soma);
				
	}
	
	@Test
	public void testSomaDez() {
		
		double soma = resul.soma(0, -0);
		assertEquals(0, soma);
	}

}
