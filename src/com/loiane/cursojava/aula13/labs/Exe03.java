package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int numero2 = scan.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("A soma � = " + soma + ".");

		scan.close();

	}

}
