package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em que turno você estuda? M - Matutino ou V - Vespertino ou N- Noturno");
		String turno = scan.next();
		
		switch (turno) {
		case "M":
			turno = "Bom dia!";
			System.out.println(turno);
			break;
		case "V":
			turno = "Boa tarde!";
			System.out.println(turno);
			break;
		case "N":
			turno = "Boa noite!";
			System.out.println(turno);
			break;
		default:
			System.out.println("Valor inválido");
		}
		
		scan.close();
	
	}

}
