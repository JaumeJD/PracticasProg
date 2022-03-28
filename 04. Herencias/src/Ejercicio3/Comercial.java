package Ejercicio3;

public class Comercial extends Empleado {
	private double comision;

	public Comercial() {
		super();

	}

	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);

	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return super.toString() + ". Su comision es " + getComision() + ".";
	}

	public boolean plusComercial() {
		if (getEdad() > 30 & comision > 200) {
			double newComision = getSalario() + plus;
			setSalario(newComision);

			return true;
		}
		return false;
	}
}
