package abaixoDaMedia;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas posições o vetor terá: ");
		int n = sc.nextInt();

		double vetor[] = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Por favor digite um número: ");
			vetor[i] = sc.nextDouble();
		}

		System.out.println();
		double soma = 0.0;
		double media = 0.0;
		System.out.print("Média do vetor = ");
		for (int i = 0; i < vetor.length; i++) {
			soma = soma + vetor[i];
		}

		media = soma / n;
		System.out.printf(" %.3f ", media);

		System.out.println();
		System.out.println("Elementos abaixo da média: ");
		for (int j = 0; j < vetor.length; j++) {
			if (vetor[j] < media)
				System.out.printf("%.1f%n ", vetor[j]);
		}
		sc.close();
	}

}
