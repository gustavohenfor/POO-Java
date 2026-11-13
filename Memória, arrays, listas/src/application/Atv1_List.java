package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Funcionario;

public class Atv1_List {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Funcionario> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
		
			System.out.printf("Employee #%d:%n ",i+1);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Salario: R$");
			Double salario = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, name, salario);
			
			list.add(funcionario);
		}
		
		System.out.print("Enter the employee ID that will have salary increase: ");
		int idsalary = sc.nextInt();
		Integer pos = position(list, idsalary);
		
		if(pos == null) {
			System.out.println("ID inválido! ");
		} else {
			System.out.print("Digite a pocentagem: ");
			int vSalario = sc.nextInt();
			list.get(pos).Aumento(vSalario);
			
		}
		System.out.println(list);
		
		

			sc.close();
	}

	private static Integer position(List<Funcionario> list, int idsalary) {
	    for (int i = 0; i < list.size(); i++) {
	        if (list.get(i).getId() == idsalary) {
	            return i;
	        }
	    }

	    return null;
	}


}


