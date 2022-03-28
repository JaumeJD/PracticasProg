package encuentranumero;

public class encuentraNumero {

	private int[] numeros = { 1, 2, 3, 4, 5 };

	public boolean busca(int num) {

		for (int i = 0; i < numeros.length; i++) {
			if (num == numeros[i]) {
				return true;
			}
		}
		return false;
	}
}
