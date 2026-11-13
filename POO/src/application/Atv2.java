package application;

import java.util.Scanner;

import entidade.Funcionario;

public class Atv2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.name =  sc.nextLine();
		System.out.print("Salario: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Impostos & Taxas: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println("Funcionario: " + funcionario.name + ", $ " + funcionario.salarioLiquido());
		
		System.out.print("Quanto quer aumentar no salário? ");
		double porcentagem = sc.nextDouble();
		funcionario.aumentoSalario(porcentagem);
		
		System.out.println("Atualização: "+ funcionario.toString());
	}
 
}
