package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		double salarioBruto, valorHoraTrabalhada, percentual = 0;
		int quantidadeHorasMês;

		System.out.println("Digite o valor da sua hora: ");
		valorHoraTrabalhada = scan.nextDouble();

		System.out.println("Digite a quantidade de horas do mês: ");
		quantidadeHorasMês = scan.nextInt();

		// fórmula do salário bruto
		salarioBruto = valorHoraTrabalhada * quantidadeHorasMês;

		// Lógica para calcular o desconto do salário e IR
		if (salarioBruto <= 900) {
			System.out.println("Isento.");
		} else if (salarioBruto <= 1500) {
			percentual = 5;
		} else if (salarioBruto <= 2500) {
			percentual = 10;
		} else {
			percentual = 20;
		}

		// Percentual e cálculo de desconto do IR com base no salário bruto
		double descontoIR = (salarioBruto / 100) * percentual;

		// Percentual e cálculo de desconto do FGTS com base no salário bruto
		double percentualFGTS = 11;
		double descontoFGTS = (salarioBruto / 100) * percentualFGTS;
		// Percentual e cálculo de desconto do IN com base no salário bruto
		double percentualINSS = 10;
		double descontoINSS = (salarioBruto / 100) * percentualINSS;

		double totalDescontos = descontoIR + descontoINSS;
		double salarioLiquido = salarioBruto - descontoIR - descontoINSS;

		System.out.printf("Salário bruto: (valor da hora x quantidade de horas trabalhadas no mês) = R$ % .2f \n",
				salarioBruto);

		System.out.printf("(-) IR " + "( " + percentual + ")" + "                 " + ": R$ % .2f \n", descontoIR);

		System.out.printf("(-) FGTS " + "( " + percentualFGTS + ")" + "                 " + ": R$ % .2f \n",
				descontoFGTS);

		System.out.printf("(-) INSS " + "( " + percentualINSS + ")" + "                 " + ": R$ % .2f \n",
				descontoINSS);

		System.out.printf("Total de descontos: R$ % .2f \n", totalDescontos);

		System.out.printf("Salário Liquido: R$ % .2f", salarioLiquido);

		scan.close();
	}

}
