package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Nome: ");
		student.name = sc.nextLine();
		
		System.out.print("Nota do primeiro trimestre: ");
		student.grade1 = sc.nextDouble();
		
		System.out.print("Nota do segundo trimestre: ");
		student.grade2 = sc.nextDouble();
		
		System.out.print("Nota do terceiro trimestre: ");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("Nota Final = %.2f %n", student.totalGrade());
		
		if (student.totalGrade() < 60.0) {
			System.out.println("Reprovou");
			System.out.printf("Faltam %.2f pontos%n", student.mediaGrade());
		} else {
			System.out.println("Passou");
		}
		
		sc.close();
	}

}
