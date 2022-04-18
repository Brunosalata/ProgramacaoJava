import java.util.Locale;
import java.util.Scanner;

import data.Grade;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		var myGrade = new Grade();		// necessário instanciar
		
		System.out.println("Enter the name:");
		myGrade.name = sc.nextLine();
		System.out.println("Enter grade 1 (0 to 30)");
		myGrade.grade1 = sc.nextDouble();
		System.out.println("Enter grade 2 (0 to 35)");
		myGrade.grade2 = sc.nextDouble();
		System.out.println("Enter grade 3 (0 to 35)");
		myGrade.grade3 = sc.nextDouble();
		
		System.out.println(myGrade.score());
		
		if (myGrade.finalGrade >= myGrade.approval) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", myGrade.missing()) + " POINTS");
		}
		sc.close();

	}

}
