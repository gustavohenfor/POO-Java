package application;

import java.util.Scanner;

public class atv4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] numero = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			numero[i] = sc.nextInt();
		}
		System.out.println("Numeros pares: ");
		
		int qtdpares = 0;
		for(int i=0;i<n;i++) {
			if(numero[i] % 2 == 0) {
				System.out.printf("%d %n", numero[i]);
				qtdpares++;
			}
		}
		System.out.print("Quantidade de Pares: " + qtdpares);

	}

}
