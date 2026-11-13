package application;

import java.util.Scanner;

import entidade.Estudante;

public class At3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
	    estudante.nome = sc.nextLine();
	    estudante.n1 = sc.nextDouble();
	    estudante.n2 = sc.nextDouble();
	    estudante.n3 = sc.nextDouble();
	    
	    System.out.println("Media final de: " + estudante.media());

	    if (estudante.media() < 6) {
	    	System.out.println("Reprovado");
	    } else {
	    	System.out.println("Aprovado");
	    }
	    
		
		
		
		
		

	}

}
