package primeiro_projeto_curso;

import java.util.Scanner;

public class Lojinha {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		int idade;
		double valor;

		nome = sc.next();
		idade = sc.nextInt();
		valor = sc.nextDouble();

		System.out.println("Você digitou:");
		System.out.printf("Seu nome %s%n", nome);
		System.out.printf("Sua idade %d years old%n", idade);
		System.out.printf("Seu valor de mercado %f%n", valor);

		sc.close();
	}
}
