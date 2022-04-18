package application;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static final double PI = 3.14159;		// termo final indica que PI é uma constante. nomenclatura da constante no JAVA: tudo maiusculo e separado por underline
	
	public static void main(String[] args) {		// membro estático é aquele que não precisa de objeto para serem chamados
													// não dependem de objeto, então, não são instanciados, como funções mateméticas como o Math.sqrt(double)
													// são chamados diretamente pelo nome da classe

		// Versão 1: métodos na própria classe do programa
		// Nota: dentro de um método estático não se pode chamar membors de instância da mesma classe
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PPI value: %.2f%n", PI);
		
		sc.close();
	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
	
	
		// Versão 2: classe Calculator com membros de instância     --> não fará sentido
		
		
		
		// Versão 3: classe Calculator com método estático
		


}
