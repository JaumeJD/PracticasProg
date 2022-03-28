package ordenanumeros;

public class OrdenaNumeros {
	public String ordenaNumeros(int n1, int n2, int n3) {
		if ((n1 > n2) && (n2 > n3)) {
			return ("El orden es: " + n1 + n2 + n3);
		} else if ((n1 > n3) && (n3 > n2)) {
			return ("El orden es: " + n1 + n3 + n2);
		} else if ((n2 > n1) && (n1 > n3)) {
			return ("El orden es: " + n2 + n1 + n3);
		} else if ((n2 > n3) && (n3 > n1)) {
			return ("El orden es: " + n2 + n3 + n1);
		} else if ((n3 > n2) && (n2 > n1)) {
			return ("El orden es: " + n3 + n2 + n1);
		} else {
			return ("El orden es: " + n3 + n1 + n2);
		}
	}
}
