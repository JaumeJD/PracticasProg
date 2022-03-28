//Escribe un programa que calcule el total de una factura a partir de la base imponible (precio
//sin IVA). La base imponible estará almacenada en una variable.

import java.util.Scanner;

public class Ej6 {
	
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Dime la base imponible de una factura reciente:");
		double baseimp=sn.nextInt();
		double total=baseimp*1.21;
		System.out.println("El total de la factura sería de "+total+"€");
		sn.close();
	}
}
