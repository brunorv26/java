/**
 * Atividade JokenPO
 * @Author Bruno Rodrigues/ Fabricio Ferreira
 *  13/06/2018
 */

package br.com.java;

import java.util.Random;
import java.util.Scanner;

public class JokenPO {

	public static void main(String[] args) {

		int opcao = 0;
		int jogador;
		int computador = 0;
		char escolha;
		Scanner teclado = new Scanner(System.in);
		System.out.println("1. pedra");
		System.out.println("2. papel");
		System.out.println("3. tesoura");
		do {
		System.out.println("Digite a opção desejada: ");
		jogador = teclado.nextInt();
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;

		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;

		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;

		default:// Caso nenhuma opção selecionada
			System.out.println("Opção Inválida");
			break;

		}
		Random opcao1 = new Random();
		computador = opcao1.nextInt(3) + 1;
		switch (computador) {

		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;

		case 2:
			System.out.println("Computador escolheu PAPEL");
			break;

		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;

		}

		if ((jogador == 1 && computador == 1) || (jogador == 2 && computador == 2)
				|| (jogador == 3 && computador == 3)) {
			System.out.println("EMPATE");

		} else if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
				|| (jogador == 3 && computador == 2)) {
			System.out.println("Jogador VENCEU");

		} else  {
			System.out.println("Computador venceu");
		}
		System.out.println("Deseja jogar novamente?");
		escolha = teclado.next().charAt(0);
		} while (escolha == 's');
	}

}
