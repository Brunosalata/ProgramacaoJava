package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class main {

	public static void main(String[] args) { 					// membro estático é aquele que não precisa de objeto para serem chamados
																// não dependem de objeto, então, não são instanciados, como funções mateméticas
																// como o Math.sqrt(double)
																// são chamados diretamente pelo nome da classe

		// Versão 2: classe Calculator com membros de instância 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = calc.circumference(radius);

		double v = calc.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PPI value: %.2f%n", calc.PI);

		sc.close();
	}

}
