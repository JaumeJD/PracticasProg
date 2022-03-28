//Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere convertir deberá
//estar almacenada en una variable.

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Dime una cifra en €:");
		double euros=sn.nextInt();
		double pesetas=euros*166;
		
		System.out.println(euros+"€ son "+pesetas+" pesetas.");
		sn.close();
	}
}
