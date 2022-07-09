package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int nota = 0;
		
		while(nota >= 0 && nota <= 10) {
			System.out.println("Digite uma nota: ");
			nota = scan.nextInt();
			
			if(nota < 0 || nota > 10) {
				System.out.println("Valor inválido!");
				System.out.println("Fim do programa.");
				System.exit(0);
			} 
		}

		scan.close();
	}

}
