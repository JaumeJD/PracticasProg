
public class Matematicas {

	// DA LA VUELTA A UN NÚMERO
	public static int voltea(int x) {
		int y = 0;
		do {
			y = y * 10 + (x % 10);
			x = x / 10;
			if (x < 10) {
				y = y * 10 + x;
			}
		} while (x > 10);
		return y;
	}

	// DICE SI ES CAPICUA O NO
	public static boolean esCapicua(int x) {
		voltea(x);
		if (voltea(x) == x) {
			return true;
		} else {
			return false;
		}
	}

	// DICE SI ES PRIMO O NO
	public static boolean esPrimo(int x) {
		for (int i = 2; i <= x; i++) {
			
			if ((x % i) == 0) {
				return false;
			}
			
		}
		return true;
	}
	
	
}