
public class Main {

	public static void main(String[] args) {
		
		/*Comando de atribuição
		  
		 	Sintaxe:
			<variável> = <expressão>;
		 */

	// Exemplo 1
		int x, y;
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
	// Exemplo 2
		int w;
		double z;
		w = 5;
		z = 2 * w;
		
		System.out.println(w);
		System.out.println(z);
		
	// Exemplo 3
						
		double b1, B1, h1, area1;
		b1 = 6.0;
		B1 = 8.0;
		h1 = 5.0;
		area1 = (b1 + B1) / 2.0 * h1;
		
		System.out.println(area1);
		
		//Sempre indique o tipo do número, se a expressão for de ponto flutuante (não inteira).
				//Para double use: .0		Para float use:f
		
		float b2, B2, h2, area2;
		b2 = 6f;
		B2 = 8f;
		h2 = 5f;
		area2 = (b2 + B2) / 2f * h2;
		System.out.println(area2);
		
	// Exemplo 4
		
		int c, d;
		double resultado;
		c = 5;
		d = 2;
		resultado = c / d;
		
		System.out.println(resultado);
		
		// O resultado é um número inteiro porque c e d foram definidas como inteiros
		// Para resolver isso, devemos considerar variáveis de origem como double
		
		/* Possibilidades
		 
		 int a, b;
			double resultado;
			a = 5;
			b = 2;
			resultado = (double) a / b;
			
			System.out.println(resultado);

		 A inclusão do (double) é denominada casting, que é a conversão explícita dos valores
		 
		 */
		
	// Exemplo 5
		// Outra situação na qual usamos o casting é quando o  compilador considera perda de informação com o processo
		
		/*
		double n1;
		int o1;
		n1 = 5.0;
		o1 = n1;
		
		System.out.println(o1);
		
		Compilador apresenta erro, pois não é possível converter uma variável double em int
		a não ser que a gente indique explicitamente que as casa sdecimais não são relevantes.
		Fazemos isso inserindo (int) logo antes da variável em quenstão, da seguinte forma: */
		
		double n2;
		int o2;
		n2 = 5.0;
		o2 = (int) n2;
		
		System.out.println(o2);
		
		
	}

}
