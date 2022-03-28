
package Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static Scanner sn = new Scanner(System.in);
	static ArrayList<Empleado> empleado = new ArrayList<Empleado>();

	public static void main(String[] args) {
		String nombre, zona;
		int edad = 0;
		double salario, plus = 300, comision;

		System.out.println("Introduce los datos de un repartidor: ");
		System.out.print("Nombre: ");
		nombre = sn.nextLine();
		System.out.print("Edad: ");
		edad = sn.nextInt();
		System.out.print("Salario: ");
		salario = sn.nextDouble();
		System.out.print("Zona: ");
		zona = sn.nextLine();
		zona = sn.nextLine();
		if (edad < 25 & zona == "zona 3") {
			salario = salario + plus;
		}
		Repartidor repartidor = new Repartidor(nombre, edad, salario, zona);
		empleado.add(repartidor);
		System.out.println();
		System.out.println("Ahora introduzca los datos de un comercial:");
		System.out.print("Nombre: ");
		nombre = sn.nextLine();
		System.out.print("Edad: ");
		edad = sn.nextInt();
		System.out.print("Salario: ");
		salario = sn.nextDouble();
		System.out.print("Comision: ");
		comision = sn.nextDouble();
		if (edad > 30 & comision > 200) {
			salario = salario + plus;
		}
		Comercial comercial = new Comercial(nombre, edad, salario, comision);
		empleado.add(comercial);

		System.out.println("Estos son los empleados registrados:");
		for (Empleado emp : empleado) {
			System.out.println(emp.toString());
		}
	}

}
