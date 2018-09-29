package unitTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import backend.PostfixEvaluator;

class PostfixEvaluatorTest {
	@Test
	void test() {
		PostfixEvaluator postfixEvaluator= new PostfixEvaluator();
		double actualReslut=Double.valueOf(postfixEvaluator.evaluate("973+6*+"));
		assertEquals(69, actualReslut);
	}

}
