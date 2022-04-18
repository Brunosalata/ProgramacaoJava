package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class main {

	// Quando falamos de dois triangulos, X e Y, cada um tem seus próprios lados (X - A, B e C / Y - D, E e F)
	// função área = x.area() retornará um valor diferente para cada triângulo, então essa é uma operação de instância de objeto
	
	// No caso da Calculator, os valores dos cálculos não mudam para calculadoras diferentes, são cálculos estáticos
	// Calculator calc1 = new Calculator();
	// Calculator calc2 = new Calculator();
	// sendo PI = 3.14 e PI é estático, calc1.PI e calc2.PI retornarão 3.14
	// o mesmo se aplica a calc1.circumference(3.0) e calc2.circumference(3.0) retornarão 18.85, independente do objeto (calc1 ou calc2)
	
	// Como PI e os métodos não dependem do objeto (cálculo de volume, valor de PI, cálculo de área, etc), vamos torná-los estáticos
	

	public static void main(String[] args) {
		
			// Versão 3: classe Calculator com método estático

			Locale.setDefault(Locale.US);						// Uma vez que os métodos e variáveis são estáticos na classe Calculator
			Scanner sc = new Scanner(System.in);				// não é necessário instanciar Calculator. Chamaremos as funções diretamente
			// Calculator calc = new Calculator();				// inclusão do nome da classe + a função ou variável desejada

			System.out.print("Enter radius: ");
			double radius = sc.nextDouble();

			// double c = calc.circumference(radius);
			double c = Calculator.circumference(radius);

			// double v = calc.volume(radius);
			double v = Calculator.volume(radius);
			
			System.out.printf("Circumference: %.2f%n", c);
			System.out.printf("Volume: %.2f%n", v);
			System.out.printf("PPI value: %.2f%n", Calculator.PI);

			sc.close();
	}

}

