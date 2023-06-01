package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.importedProduct;
import entities.usedProduct;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Customs fee: ");
				double customFee = sc.nextDouble();
				Product emp = new importedProduct(name, price, customFee);
				list.add(emp);
			} else if (ch == 'c' ){
				list.add(new Product(name, price));
			} else {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new usedProduct(name, price, date));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product emp : list) {
			System.out.println(emp.priceTag());
		}
		
		sc.close();
	}

}
