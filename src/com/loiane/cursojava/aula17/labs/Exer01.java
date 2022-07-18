package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int nota = 0;
		
		// Enquanto esse valor for verdadeiro o loop ser� executado
		while(nota >= 0 && nota <= 10) {
			System.out.println("Digite uma nota: ");
			nota = scan.nextInt();
			
			// Se o valor for inv�lido, o programa emite uma mensagem e encerra o seu funcionamento
			if(nota < 0 || nota > 10) {
				System.out.println("Valor inv�lido!");
				System.out.println("Fim do programa.");
				System.exit(0);
			} 
		}

		scan.close();
	}

}
