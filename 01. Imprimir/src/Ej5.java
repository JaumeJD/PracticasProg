//Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere convertir
//deberá estar almacenada en una variable.

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Dime una cifra en pesetas:");
		double pesetas=sn.nextInt();
		double euros=pesetas/166;
		
		System.out.println(pesetas+" pesetas son "+euros+"€.");
		sn.close();
	}
}
