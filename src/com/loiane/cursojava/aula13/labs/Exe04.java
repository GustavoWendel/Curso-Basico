package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.println("Digite a primeira nota: ");
		nota2 = sc.nextDouble();
		
		System.out.println("Digite a primeira nota: ");
		nota3 = sc.nextDouble();
		
		System.out.println("Digite a primeira nota: ");
		nota4 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("Média é: % .2f  ", media);
		
		sc.close();

	}

}
