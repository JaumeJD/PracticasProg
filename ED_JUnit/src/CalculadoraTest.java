import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora(20, 10);
		int resul = calc.suma();
		assertEquals(30, resul);
	}

	@Test
	public void testResta() {
		Calculadora calc = new Calculadora(20, 10);
		int resul = calc.resta();
		assertEquals(10, resul);
	}

	@Test
	public void testMultiplica() {
		Calculadora calc = new Calculadora(20, 10);
		int resul = calc.multiplica();
		assertEquals("Fallo en la multiplicación: ", 200, resul);
	}

	@Test
	public void testDivide() {
		try {
			Calculadora calc = new Calculadora(20, 0);
			int resul = calc.divide();
			fail("Fallo, debería haber lanzado la excepción");
		} catch (Exception e) {
			// PRUEBA satisfactoria
		}
	}

}
