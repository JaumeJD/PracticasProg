package Ejercicio1;

public class Tecnico extends Operario {

	public Tecnico() {
		super();
	}

	public Tecnico(String nombre) {
		super(nombre);
	}

	public String toString() {

		return super.toString() + " -> Tecnico";
	}
}
