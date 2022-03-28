package sumdigits;

import static org.junit.Assert.*;
import org.junit.Test;

public class SumDigitsTest {

	@Test
	public void test() {
		SumDigits sd = new SumDigits(20);
		int resul = sd.sum();
		assertEquals(2,resul);
	}

}
