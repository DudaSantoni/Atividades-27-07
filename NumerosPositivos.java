package atividades2407;

import java.util.ArrayList;
import java.util.Scanner;

public class NumerosPositivos {

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
		if (todosPositivos(numeros)) {
			System.out.println("Todos os números são positivos");
		}
		else {
			System.out.println("Nem todos os números são positivos");
		}
	}
	public static boolean todosPositivos(ArrayList <Integer> numeros) {
		for (int numero : numeros) {
			if (numero <= 0) { //verifica se o número é 0 ou negativo
				return false;
			}
		}
		return true;
	}
}
