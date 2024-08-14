package atividades2407;

import java.util.ArrayList;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		System.out.println("Digite números inteiros, caso deseje finalizar, digite '0'.");

		while (true) {
			int numero = ler.nextInt();
			if (numero == 0) {
				break;
			}
			numeros.add(numero);
		}

		System.out.println("Números pares na lista: ");
		mostrarNumerosPares(numeros);
	}
	public static void mostrarNumerosPares(ArrayList <Integer> numeros) {
		for (int numero : numeros) {
			if (numero % 2 == 0) {
				System.out.println(numero);
			}
		}
	}

}
