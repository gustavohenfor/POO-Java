package application;

import java.util.Scanner;

public class Atv6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		System.out.println("Digite os valores para o vetor A");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores para o vetor B");
		for(int i=0;i<n;i++) {
			b[i] = sc.nextInt();
		}
		
		int[] c = new int[n];
		System.out.println("Vetor resultante:");
		for(int i=0;i<n;i++) {
			c[i] = a[i] + b[i];
		System.out.printf("%d %n", c[i]);
		}

}

}
