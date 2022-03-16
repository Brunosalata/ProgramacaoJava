import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//	Expressão condicional ternária
		
		//	Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma
		//	condição.
		
		//	Sintaxe:
		
		//		( condição ) ? valor_se_verdadeiro : valor_se_falso

		/*	Exemplo
		
			( 2 > 4 ) ? 50 : 80		-->		80
					
			( 10 != 3 ) ? "Maria" : "Alex"		-->		"Maria"
		*/
		
		/*	Exemplo aplicado
			
			Forma normal
			
		 		double preco = 34.5;
				double desconto;
				
				if (preco < 20.0) {
					desconto = preco * 0.1;
				}
				else {
					desconto = preco * 0.05;
				}
				
			Forma simplificada
			
				double preco = 34.5;
				double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
						
		 */
			
		//	Aplicação no eclipse
		  
		 	Scanner sc = new Scanner(System.in);
		 	
		 	double preco = 34.5;
		 	
		//	Forma normal
		// 	
		//		double desconto;
		//	
		//		if (preco < 20.0) {
		//			desconto = preco * 0.1;
		//		}
		//		else {
		//			desconto = preco * 0.05;
		//		}
		
		// 	Forma simplificada
		 	
		 	double desconto = ( preco < 20.0 ) ? preco * 0.1 : preco * 0.05;
		 	
			System.out.println(desconto);
			
			sc.close();
				
	}

}
