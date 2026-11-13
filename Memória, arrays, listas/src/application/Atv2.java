package application;

import java.util.Scanner;



public class Atv2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números vai digitar? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		System.out.print("Valores Digitados: ");
		
		for(int i=0;i<n;i++) {
			System.out.printf("%.1f, ", vetor[i]);
		}
		
		double soma = 0;
		double media = 0;
		
		for(int i=0; i<n; i++) {
			soma = soma +vetor[i];
		}
		
		media = soma/n;
		System.out.println();
		System.out.println("Soma: " +soma);
		System.out.println("Media: " +media);

	}

}
