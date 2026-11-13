package application;

import java.util.Scanner;

import entidade.Pessoa;

public class Atv3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas?? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for(int i=0;i<n;i++) {
			System.out.printf("Dados da %da pessoa: %n", i + 1);
			
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			
		}
		double soma = 0;
		for(int i=0;i<n;i++) {
			soma = soma + altura[i];
		}
		double avg = soma/n;
		
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + avg);

	}

}
