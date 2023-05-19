package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperacaoTest_Subtracao {

	Operacao resul = new Operacao();
	
	@Test
	public void testSubtracaoUm() {
		
		double subtracao = resul.subtracao(25, 5);
		assertEquals(20, subtracao);
		
	}
	
	@Test
	public void testSubtracaoDois() {
		
		double subtracao = resul.subtracao(5789, 6952);
		assertEquals(-1163, subtracao);
		
	}
	
	@Test
	public void testSubtracaoTres() {
		
		double subtracao = resul.subtracao(10, 10);
		assertEquals(0, subtracao);
		
	}
	
	@Test
	public void testSubtracaoQuatro() {
		
		double subtracao = resul.subtracao(794682, 86525);
		assertEquals(708157, subtracao);
		
	}
	
	@Test
	public void testSubtracaoQuinto() {
		
		double subtracao = resul.subtracao(-9685, -9856);
		assertEquals(171, subtracao);
		
	}
	
	@Test
	public void testSubtracaoSexto() {
		
		double subtracao = resul.subtracao(-0, -0);
		assertEquals(0, subtracao);
		
	}
	
	@Test
	public void testSubtracaoSete() {
		
		double subtracao = resul.subtracao(222, 333);
		assertEquals(-111, subtracao);
		
	}
	
	@Test
	public void testSubtracaoOito() {
		
		double subtracao = resul.subtracao(86493531, 976521968);
		assertEquals(-890028437, subtracao);
		
	}
	
	@Test
	public void testSubtracaoNove() {
		
		double subtracao = resul.subtracao(50, 25);
		assertEquals(25, subtracao);
		
	}
	
	@Test
	public void testSubtracaoDez() {
		
		double subtracao = resul.subtracao(5, 3);
		assertEquals(2, subtracao);
		
	}

}
