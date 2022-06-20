package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int num = scan.nextInt();
	
		if(num > 0 ) {
			System.out.println(num + " é positivo" );
		} else {
			System.out.println(num + " é negativo" );
		}
		
		scan.close();
	}

}
