package com.loiane.cursojava.aula17.beecrowd;

import java.util.Scanner;

public class BeeCrowd1073 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int n = scan.nextInt();
		
		for (int contador = 1; contador <= n; contador++) {
			if(contador % 2 == 0) System.out.println(contador + "^2 = " + (contador * contador));
		}
		
		scan.close();
	}

}
