package com.loiane.cursojava.aula17.labs;

public class LoopFor {

	public static void main(String[] args) {
		/*
		 * for (inicializa��o; condi��o; atualiza��o) { //Bloco de c�digo }
		 */

		for (int i = 0; i < 5; i++) {
			System.out.println("i tem valor: " + i);
		}

		for (int i = 5; i > 0; i--) {
			System.out.println("i tem valor: " + i);
		}

		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i = " + i + " j = " + j);
		}

		int cont = 0;

		for (; cont < 10;) {
			System.out.println("valor de cont: " + cont);
			cont += 2;
		}

//		for (int count = 0; cont < 10; count += 2) {
//			System.out.println("valor de count: " + count);
//		}
//		
		
		int soma = 0;
		
		//somar valores
		for (int i =1; i < 5; soma += i++); 
		System.out.println("O valor da soma = " + soma);
		
	}

}
