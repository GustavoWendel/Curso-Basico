package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double area, base, altura, dobroArea;

		System.out.println("Digite o valor da base: ");
		base = sc.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		
		dobroArea = area * 2;
		
		System.out.printf("O dobro da área é = % .2f", dobroArea);
		
		
		sc.close();
	}

}
