package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {
	public static void main(String[] args) {
		
		//Classe: É a definição do tipo.
		//Objetos: São instancias da classe.
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("\nTriangle x area %.4f", areaX);
		System.out.printf("\nTriangle y area %.4f", areaY);
		
		if(areaX > areaY) {
			System.out.println("\nLarger area: X");
		}else {
			System.out.println("\nLarger area: Y");
		}
	
		sc.close();
		
	}
}
