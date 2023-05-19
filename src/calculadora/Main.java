package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double num1, num2, resultado;
		
		System.out.println("Digite o primeiro numero: ");
		Scanner leia = new Scanner (System.in);
		num1 = leia.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		num2 = leia.nextDouble();
		
		Operacao resul = new Operacao();
		
		//SOMA
		resultado = resul.soma(num1, num2);
		System.out.println("A soma é: " + resultado);
		
		//SUBTRAÇAO
		resultado = resul.subtracao(num1, num2);
		System.out.println("A subtração é: " + resultado);
		
		//DIVISÃO
		resultado = resul.divisao(num1, num2);
		System.out.println("A divisão é: " + resultado);
		
		//MULTIPLICAÇÃO
		resultado = resul.multiplicacao(num1, num2);
		System.out.println("A multiplicação é: " + resultado);
		
		

	}

}
