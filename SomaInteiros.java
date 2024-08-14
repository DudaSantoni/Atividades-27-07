package atividades2407;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaInteiros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();

		System.out.println("Digite números inteiros, caso deseje finalizar, digite '0'.");

		while (true) {
			int numero = scanner.nextInt();
			if (numero == 0) {
				break;
			}
			numeros.add(numero);
		}
		int soma = somarNumeros(numeros);
		System.out.println("A soma de todos os números é: " +soma);
	}
	public static int somarNumeros(ArrayList <Integer> numeros) {
		int soma = 0; 
		for (int numero :numeros) {
			soma += numero;
		}
		
		return soma;
	}
}


