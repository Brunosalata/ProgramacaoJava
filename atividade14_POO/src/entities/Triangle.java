package entities;

public class Triangle {

	public double a;   	   			// atributos: lados do triangulo a, b e c
	public double b;				// public define que essa classe pode ser acessada por outro programa
	public double c;
		
	// Para melhor organiza��o, passar a responsabilidade do c�lculo da �rea do tri�ngulo dentro da classe Triangle
	
	public double area() {
		double p = ( a + b + c ) / 2.0;
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));			
		return result;
		// poderia ser direto 
		// return Math.sqrt((p * (p - a) * (p - b) * ( p - c));
		
	
	}
	
}