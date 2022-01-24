package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------------------");
		System.out.println("       J O K E N P O        ");
		System.out.println("----------------------------");
		System.out.println("1 - Pedra ");
		System.out.println("2 - Papel ");
		System.out.println("3 - Tesoura ");
		System.out.println("----------------------------");

		System.out.print("Qual a sua opção: ");
		Scanner leitor = new Scanner(System.in);

		int opcao = leitor.nextInt();

		if (opcao == 1) {
			System.out.println("Você escolheu Pedra");
		} else if (opcao == 2) {
			System.out.println("Você escolheu Papel");
		} else if (opcao == 3) {
			System.out.println("Você escolheu Tesoura");

		}

		Random random = new Random();

		int numero = random.nextInt(3);

		if (numero == 1) {
			System.out.println("Computador escolheu Pedra");
		} else if (numero == 2) {
			System.out.println("Computador escolheu Papel");
		} else {
			System.out.println("Computador escolheu Tesoura");

		}

		if ((opcao == 1 && numero == 2) || (opcao == 1 && numero == 3) || (opcao == 2 && numero == 1)
				|| (opcao == 3 && numero == 2)) {
			System.out.println("Você ganhou.");
		} else if ((numero == 1 && opcao == 2) || (numero == 1 && opcao == 3) || (numero == 2 && opcao == 1)
				|| (numero == 3 && opcao == 2)) {
			System.out.println("Computador ganhou.");
		} else if ((numero == 1 && opcao == 1) || (numero == 3 && opcao == 3) || (numero == 2 && opcao == 2)) {
			System.out.println("Empate.");
		}
	}

}
