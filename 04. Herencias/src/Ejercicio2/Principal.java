package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static Scanner sn = new Scanner(System.in);
	static ArrayList<Poligono> poligono = new ArrayList<Poligono>();

	public static void llenarPoligono() {
		char respuesta;
		int opcion;
		do {
			do {
				System.out.println("Elige una opción:");
				System.out.println("1. Introducir triángulo." + "\n2. Introducir rectángulo.");
				System.out.print("Opcion: ");
				opcion = sn.nextInt();
			} while (opcion < 1 || opcion > 2);
			switch (opcion) {
			case 1:
				llenarTriangulo();
				break;

			case 2:
				llenarRectangulo();
				break;
			}
			System.out.print("¿Desea introducir otro polígono(s/n)?: ");
			respuesta = sn.next().charAt(0);
			System.out.println("");
		} while (respuesta == 's');
	}

	public static void llenarTriangulo() {
		double lado1, lado2, lado3;
		System.out.println("Introduce los 3 lados del triángulo.");
		System.out.print("\nLado1: ");
		lado1 = sn.nextDouble();
		System.out.print("\nLado2: ");
		lado2 = sn.nextDouble();
		System.out.print("\nLado3: ");
		lado3 = sn.nextDouble();
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
		poligono.add(triangulo);
	}

	public static void llenarRectangulo() {
		double lado1, lado2;
		System.out.println("Introduce los 2 lados del rectángulo.");
		System.out.print("Lado1: ");
		lado1 = sn.nextDouble();
		System.out.print("\nLado2: ");
		lado2 = sn.nextDouble();
		Rectangulo rectangulo = new Rectangulo(lado1, lado2);
		poligono.add(rectangulo);
	}

	public static void mostrarResultados() {
		// Recorriendo el array de Poligono
		for (Poligono poli : poligono) {
			System.out.println(poli.toString());
			System.out.println("Area = " + poli.area());
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Llenar un poligono
		llenarPoligono();

		// Mostrar los datos y el area de cada poligono
		mostrarResultados();
	}
}
