package main;

import java.util.Locale;
import java.util.Scanner;

import employee.Employee;

public class Data {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		var employee = new Employee();
		
		System.out.print("Write the employee name:");
		employee.name = sc.nextLine();
		System.out.print("Write the employee gross salary:");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Write the salary tax discount");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f%n%n", employee.name, employee.salary());

		System.out.print("Which percentage to increase salary?");
		employee.increaseSalary = sc.nextDouble();
		
		System.out.println();
		System.out.println(employee.updatedSalary());
		
		sc.close();
		
	}
	
}


