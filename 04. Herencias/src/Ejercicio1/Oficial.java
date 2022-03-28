package Ejercicio1;

public class Oficial extends Operario {

	public Oficial() {
		super();
	}

	public Oficial(String nombre) {
		super(nombre);
	}

	public String toString() {

		return super.toString() + " -> Oficial";
	}
}
