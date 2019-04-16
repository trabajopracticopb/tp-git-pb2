
package ar.edu.unlampb2;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Double a;
		Double b;
		Integer opcion;
		Double resultado;

		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println(
					"Ingrese su operación \n 1 para sumar \n 2 para restar \n 3 para multiplicar \n 4 para dividir");
			opcion = teclado.nextInt();

		} while (opcion < 1 && opcion > 4);

		System.out.println("\nIngrese el primer numero");
		a = teclado.nextDouble();

		System.out.println("\nIngrese el segundo numero");
		b = teclado.nextDouble();

		if (opcion.equals(1)) {
			System.out.println("El resultado de la suma es: " + (resultado = a + b));
		} else if (opcion.equals(2)) {
			System.out.println("El resultado de la suma es: " + (resultado = a - b));
		} else if (opcion.equals(3)) {
			System.out.println("El resultado de la suma es: " + (resultado = a * b));
		} else {
			if (b != 0) {
				System.out.println("El resultado de la suma es: " + (resultado = a / b));
			} else {
				System.out.println("La division por 0 no existe");
			}
		}

	}
}
