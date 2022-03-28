package Ejercicio2;

public class Rectangulo extends Poligono {

	private double lado1;
	private double lado2;

	public Rectangulo(double lado1, double lado2) {
		super(2);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double getLado1() { // GETTERS
		return lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public String toString() {
		return "RECTÁNGULO: \n" + super.toString() + "\nLado1 = " + lado1 + ", lado2 = " + lado2;
	}

	public double area() {
		return lado1 * lado2;
	}
}
