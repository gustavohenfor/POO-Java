package application;

import java.util.Scanner;

public class Aula96 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vector = new double[n];
		
		for(int i=0;i<n;i++) {
			vector[i] = sc.nextDouble();		
		}
		
		double soma = 0;
		for (int i=0; i<n;i++) {
			soma += vector[i];
		}
		double avg = soma/n;
		
		System.out.println(soma);
		System.out.println(avg);
	}

}
