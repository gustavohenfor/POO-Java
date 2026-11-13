import java.util.Scanner;

public class Aula46 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch(x) {
		case 1:
			dia = "domingo";
			break;
		default:
			dia ="segunda";
			break;
		}
	System.out.println("Hoje é " + dia);
	}

}
