package Ejercicio3;

public class Repartidor extends Empleado {
	private String zona;

	public Repartidor() {
		super();

	}

	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);

	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		return super.toString() + ". Su zona es " + getZona() + ".";
	}

	public boolean plusRepartidor() {
		if (getEdad() < 25 & zona == "zona 3") {
			double newComision = getSalario() + plus;
			setSalario(newComision);

			return true;
		}
		return false;
	}

}
