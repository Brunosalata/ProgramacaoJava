import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/* DEBUG
		Serve para interromper a aplicação no ponto desejado, para que seja possível analisar cada etapa da execução

		• Para marcar uma linha de breakpoint:
			• Run -> Toggle Breakpoint
		• Para iniciar o debug:
			• Botão direito na classe -> Debug as -> Java Application
		• Para executar uma linha:
			• F6
		• Para interromper o debug: STOP
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();

	//	Estrutura repetitiva enquanto (while)	
		
		
	//	Estrutura repetitiva para (for)		
		

	//	Estrutura repetitiva faça-enquanto (do-while)		
		
		
		
		
	}

}
