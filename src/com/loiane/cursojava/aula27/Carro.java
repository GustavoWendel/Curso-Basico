package com.loiane.cursojava.aula27;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + "km");
	}
	
	public double obterAuntonomia() {
		
		System.out.println("M�todo obterAutonomia foi chamado");
		
		return capCombustivel * consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {
		double qtdCombustivel = km / consumoCombustivel;
		return qtdCombustivel;	
	}
}
