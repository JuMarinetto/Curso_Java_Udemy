package entities;

public class Employee {

	public String name;
	public double salary;
	public double tax;
	
	public double netSalary() {
		return salary - tax;
	}
	
	public void increaseSalary(double porcentagem) {
		salary += salary * porcentagem / 100.0;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}
