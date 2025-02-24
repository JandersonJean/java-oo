package Exemplo02.application;

import java.util.Locale;
import java.util.Scanner;

import Exemplo02.entities.Product;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Product product = new Product();
		System.out.println("Enter product: ");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		
		product.totalValueInStock();
		System.out.println(product.toString());
		
		product.AddProducts(5);
		System.out.println(product.toString());
		
		product.RemoveProducts(3);
		System.out.println(product.toString());
		
		sc.close();
	}
}
