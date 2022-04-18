import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Operadores de atribuição cumulativa
		
		/* Exemplo: Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
			dá direito a 100 minutos de telefone. Cada minuto que exceder a
			franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
			quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
			a ser pago
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		double conta = 50.0;
		
		if ( minutos > 100 ) {
			conta = conta + (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor a pagar = R$ %.2f%n", conta);
		
		sc.close();
		
		*/
		
		//	Tabela de atribuição cumulativa
		//	
		//	a = a + b	-->		a += b;	 
		//	a = a - b	-->		a -= b;
		//	a = a * b	-->		a *= b;
		//	a = a / b	-->		a /= b;
		//	a = a % b	-->		a %= b;
		//	
		//	Aplicando no exemplo acima, podemos definir o comando if como
		//	
		//	if ( minutos > 100 ) {
		//		conta += (minutos - 100) * 2.0;
		//	}
			
			
		
		// Estrutura switch-case
		//	Alternativa para uma estrutura if-else encadeada
		//	
		// Exemplo: Fazer um programa para ler um valor inteiro de 1 a 7 representando um
		//	dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
		//	Escrever na tela o dia da semana correspondente, conforme exemplos

		/*	Estrutura de if-else encadeado
			
			Scanner sc = new Scanner(System.in);
			
			int x = sc.nextInt();
			String dia;
			
			if (x == 1) {
				dia = "domingo";
			}
			else if (x == 2) {
				dia = "segunda";
			}
			else if (x == 3) {
				dia = "terca";
			}
			else if (x == 4) {
				dia = "quarta";
			}
			else if (x == 5) {
				dia = "quinta";
			}
			else if (x == 6) {
				dia = "sexta";
			}
			else if (x == 7) {
				dia = "sabado";
			}
			else {
				dia = "valor invalido";
			}
			System.out.println("Dia da semana: " + dia);
			sc.close();
	
		*/
		/*	Estrutura switch-case
		
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			String dia;
			switch (x) {
			case 1:
				dia = "domingo";
				break;
			case 2:
				dia = "segunda";
				break;
			case 3:
				dia = "terca";
				break;
			case 4:
				dia = "quarta";
				break;
			case 5:
				dia = "quinta";
				break;
			case 6:
				dia = "sexta";
				break;
			case 7:
				dia = "sabado";
				break;
			default:							//
				dia = "valor invalido";
				break;
			}
			System.out.println("Dia da semana: " + dia);
			sc.close();
		
		*/
		/*
			Sintaxe do switch-case
			
			switch ( expressão ) {
			case valor1:
				comando1
				comando2
				break;
			case valor2:
				comando3
				comando4
				break;
			default:
				comando5
				comando6
				break;
			}
		
		 */
	
	
	}

}
