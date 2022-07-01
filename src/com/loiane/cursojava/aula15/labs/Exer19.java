package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		
		if(numero < 1000) {
			System.out.println("Digite um número: ");
			numero = scan.nextInt();
			
			int centenas = numero / 100;
			int dezenas = ( (numero - (centenas * 100) ) / 10);
			int unidades = (numero - (centenas * 100 + dezenas * 10));
			
			System.out.println(centenas + " centenas" );
			System.out.println(dezenas + " dezenas" );
			System.out.println(unidades + " unidades" );
			scan.close();
		} else {
			System.out.println("Valor acima do exigido" );
			System.exit(0);
		}
	}
}
