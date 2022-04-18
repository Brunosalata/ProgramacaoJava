import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);			// Locale deve ser inserido antes do Scanner, para que seja reconhecido
		Scanner sc = new Scanner(System.in);	// Caso contrário, decimas separado por "." não será reconhecido e dará erro de sintaxe
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle);
		
		sc.close();
		
		
	}

}