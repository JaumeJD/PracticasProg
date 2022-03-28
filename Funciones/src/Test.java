import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Dime un numero.");
		int x=s.nextInt();
		System.out.println(Matematicas.esCapicua(x));
		s.close();
	}
}
