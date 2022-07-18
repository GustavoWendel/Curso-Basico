package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		double salarioBruto, valorHoraTrabalhada, percentual = 0;
		int quantidadeHoras;

		System.out.println("Digite o valor da sua hora: ");
		valorHoraTrabalhada = scan.nextDouble();

		System.out.println("Digite a quantidade de horas do m�s: ");
		quantidadeHoras = scan.nextInt();

		// f�rmula do sal�rio bruto
		salarioBruto = valorHoraTrabalhada * quantidadeHoras;

		// L�gica para calcular o desconto do sal�rio e IR
		if (salarioBruto <= 900) {
			System.out.println("Isento.");
		} else if (salarioBruto <= 1500) {
			percentual = 5;
		} else if (salarioBruto <= 2500) {
			percentual = 10;
		} else {
			percentual = 20;
		}

		// Percentual e c�lculo de desconto do IR com base no sal�rio bruto
		double descontoIR = (salarioBruto / 100) * percentual;

		// Percentual e c�lculo de desconto do FGTS com base no sal�rio bruto
		double percentualFGTS = 11;
		double descontoFGTS = (salarioBruto / 100) * percentualFGTS;
		// Percentual e c�lculo de desconto do IN com base no sal�rio bruto
		double percentualINSS = 10;
		double descontoINSS = (salarioBruto / 100) * percentualINSS;

		double totalDescontos = descontoIR + descontoINSS;
		double salarioLiquido = salarioBruto - descontoIR - descontoINSS;

		System.out.printf("Sal�rio bruto: (valor da hora x quantidade de horas trabalhadas no m�s) = R$ % .2f \n",
				salarioBruto);

		System.out.printf("(-) IR " + "( " + percentual + ")" + "                 " + ": R$ % .2f \n", descontoIR);

		System.out.printf("(-) FGTS " + "( " + percentualFGTS + ")" + "                 " + ": R$ % .2f \n",
				descontoFGTS);

		System.out.printf("(-) INSS " + "( " + percentualINSS + ")" + "                 " + ": R$ % .2f \n",
				descontoINSS);

		System.out.printf("Total de descontos: R$ % .2f \n", totalDescontos);

		System.out.printf("Sal�rio Liquido: R$ % .2f", salarioLiquido);

		scan.close();
	}

}
