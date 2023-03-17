package applications;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int numero = sc.nextInt();
		int anterior = 0, atual = 1;
		while (atual < numero) {
			int proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
		}
		if (atual == numero) {
			System.out.println(numero + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println(numero + " não pertence à sequência de Fibonacci.");
		}
		sc.close();
	}
}
