package primeiro_projeto_curso;
import java.util.Scanner;

public class entrada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String y;
		double z;
		x = sc.nextInt();
		y = sc.next();
		z = sc.nextDouble();
		System.out.println("Você digitou: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}
		
	}



