public class Program {
	
	public static void main (String[] args) {
		double x = 10.999;
		
		String nome = "Maria";
		double renda = 4000.90;
		int idade = 31;
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%4f%n", x);
		System.out.printf("Total %.2f metros%n",x);
		System.out.printf("Total =" + x + "metros%n");
		
		System.out.printf("Meu nome é %s, tenho uma idade toper de %d e ganho horrores %.2f %n", nome, idade, renda);
	}
}