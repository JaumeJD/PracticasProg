package grupob;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaImparesTest {

	@Test
	void testCuentaImpares1() {
		CuentaImpares impar = new CuentaImpares();
		int resul = impar.cuentaImpares(1);
		assertEquals(1, resul);
	}

	@Test
	void testCuentaImpares2() {
		CuentaImpares impar = new CuentaImpares();
		int resul = impar.cuentaImpares(2);
		assertEquals(1, resul);
	}

	@Test
	void testCuentaImpares3() {
		CuentaImpares impar = new CuentaImpares();
		int resul = impar.cuentaImpares(3);
		assertEquals(2, resul);
	}

	@Test
	void testCuentaImpares4() {
		CuentaImpares impar = new CuentaImpares();
		int resul = impar.cuentaImpares(4);
		assertEquals(2, resul);
	}

	@Test
	void testCuentaImpares5() {
		CuentaImpares impar = new CuentaImpares();
		int resul = impar.cuentaImpares(1);
		assertEquals(1, resul);
	}
}
