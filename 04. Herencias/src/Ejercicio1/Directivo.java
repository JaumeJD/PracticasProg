package Ejercicio1;

public class Directivo extends Empleado {

	public Directivo() {
		super();
	}

	public Directivo(String nombre) {
		super(nombre);
	}

	public String toString() {

		return super.toString() + " -> Directivo";
	}
}
