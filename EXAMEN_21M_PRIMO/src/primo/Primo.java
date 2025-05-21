package primo;

import java.util.Scanner;

public class Primo {
	public static void main(String[] arg) {
		Scanner entry=new Scanner(System.in);
		System.out.println("Buenos días Ceinmark, soy Marta Gómez");
		System.out.println("Introduce un número para averiguar si es primo o no:");
		int num=entry.nextInt();
		if(num %2==0) {
			System.out.println(num+" es par");
		}
		else {
			System.out.println(num+" no es par");
		}
		System.out.println("El número no es primo");
		System.out.println("Los divisores del número son: ");
		System.out.println("Ejemplo: El 4 no es primo");
		System.out.println("Los divisores del 4 son: 1,2, y 4");
	}
}