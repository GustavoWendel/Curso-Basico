package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exe08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o valor que ganha por hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Digite o total de horas trabalhadas no mês: ");
		double horasTrabalhadaMes = scan.nextDouble();
		
		double salarioTotal = valorHora * horasTrabalhadaMes;
		
		System.out.printf("Salário total no mês: R$ %.2f", salarioTotal);
		
		scan.close();
	}
}
