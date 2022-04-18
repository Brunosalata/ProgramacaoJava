package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;										// instanciação parcial
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();											// necessário para consumir a linha criada pelo sc.nextInt
		System.out.print("Enter account holder: ");				// caso não seja incluído, o programa pula o sysout do holder
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit? (y/n) ");
		char response = sc.nextLine().charAt(0);
		
		if ( response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, name, initialDeposit);							// conclusãoda instanciação
		}
		
		else if ( response == 'n' ) {
			account = new Account(number, name, 0.0);
		}
		
		else {
			System.out.println("Not valid answer.");
			account = new Account(number, name, 0.0);
		}
		
		System.out.println();
		System.out.printf( "Account data:%n" + account);
		
		System.out.println();
		System.out.printf("%nEnter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.addValue(depositValue);
		System.out.printf( "Updated account data:%n" + account );
		
		System.out.println();
		System.out.printf("%nEnter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.removeValue(withdrawValue);
		System.out.printf( "Updated account data:%n" + account );
		
		sc.close();

	}

}
