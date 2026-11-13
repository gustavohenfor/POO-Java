package application;

import java.util.Scanner;

public class Atv7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];

	    for (int i=0; i<n; i++) {
	    	System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
	}
	    double media = 0;
	    double soma = 0;
	    for(int i=0; i<n; i++) {
	    	soma += vetor[i];
	    }
	    media = soma/n;
	    
	    System.out.println("Media do vetor: " + media);
	    System.out.println("Elementos abaixo da media:");
	    for(int i =0;i<n;i++) {
	    	if(vetor[i] < media) {
	    		System.out.println(vetor[i]);
	    	}
	    	
	    	
	    }
	    
	    
	    
	    
	}
}
