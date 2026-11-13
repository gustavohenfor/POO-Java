package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Aula106 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		list.add("Gustavo");
		list.add("Josiane");
		list.add("Mauricio");
		
		list.add(2, "Jose");
		
		for(String x : list) {
			System.out.println(x);
		}
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());
		
		for(String x : list) {
			System.out.println(x);
		}
		
		String nome = list.stream().filter(x -> x.charAt(0) =='G').findFirst().orElse(null);
		System.out.println();
		System.out.println(nome);
	}

}
