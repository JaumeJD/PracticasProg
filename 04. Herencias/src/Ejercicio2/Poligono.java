package Ejercicio2;

abstract public class Poligono {

	protected int numeroLados;

	public Poligono(int numeroLados) { // CONSTRUCTOR PARÁMETROS
		this.numeroLados = numeroLados;
	}

	public int getNumeroLados() { // GETTER
		return numeroLados;
	}

	public String toString() { // METODO STRING
		return "Número de lados: " + numeroLados;
	}

	// METODO AREA COMO ABSTRACTO
	public abstract double area();
}
