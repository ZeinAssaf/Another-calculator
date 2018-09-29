package unitTests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import backend.Calculations;

class CalculationsTest {
	Calculations calculations= new Calculations();
	@Test
	public void addTest() {
		double actualReslut=calculations.add(3.0,3.0);
		assertEquals(6, actualReslut,0.11111);		
	}
	@Test
	void subtractTest() {
		double actualReslut=calculations.subtract(5.0, 2.0);
		assertEquals(3, actualReslut,0.11111);
	}
	@Test
	void multiplyTest(){
		double actualReslut=calculations.multiply(5.0, 2.0);
		assertEquals(10, actualReslut,0.11111);
	}
	@Test
	void dividTest() {
		double actualReslut=calculations.divide(10.0, 5.0);
		assertEquals(2, actualReslut,0.11111);
	}
	@Test
	void divideByZeroTest() {
		Throwable exception=assertThrows(ArithmeticException.class,()-> calculations.divide(4.0, 0.0));	
	}

}
