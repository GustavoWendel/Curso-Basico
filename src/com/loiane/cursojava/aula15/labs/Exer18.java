package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer18 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dia, mes, ano;  
		
		System.out.println("(Formato dd/mm/aaaa)");
		
		System.out.print("Digite o dia: ");
		dia = scan.nextInt();
		
		System.out.print("Digite o mês: ");
		mes = scan.nextInt();
		
		System.out.print("Digite o ano: ");
		ano = scan.nextInt();
		
		if(dia >= 0 && dia <= 24 && mes >= 0 && mes <= 31 && ano >= 1 && ano <= 12) {
			System.out.println("Formato da data está correto");
			System.out.println("Fim do programa");
			System.exit(0);
		} else {
			System.out.println("Formato da data não está correto");
			System.out.println("Fim do programa");
			System.exit(0);
		}
		
		
		scan.close();

	}

}
