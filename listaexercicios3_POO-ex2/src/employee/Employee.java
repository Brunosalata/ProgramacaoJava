package employee;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	public double increaseSalary;
	public double updatedSalary;
	
	public double salary() {
		return grossSalary - tax;
	}
	
	public String updatedSalary() {
		this.updatedSalary = (grossSalary + (grossSalary * increaseSalary / 100)) - tax;
		return "Updated data: " + name + ", $ " + updatedSalary;
	}
}
