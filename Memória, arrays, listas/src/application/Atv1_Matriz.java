package application;

import java.util.Scanner;

public class Atv1_Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da matriz:");
		int n = sc.nextInt();
		int[][] matriz = new int [n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matriz Diagonal: ");
		for(int i=0;i<n;i++) {
			System.out.println("linha: "+(i)+ ": "+ matriz[i][i]);
		}
		
		//Contar 
		
		int contar = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(matriz[i][j] < 0) {
					contar++;
				}
			}
		}
		if(contar > 0) {
		System.out.println("Quantia de negativos: " + contar);
		}
		
		int soma = 0;
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				soma = soma + matriz[i][j];
			}
		}
		
		System.out.println("Soma: " + soma);
		

	}

}
