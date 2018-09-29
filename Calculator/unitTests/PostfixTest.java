package unitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import backend.Postfix;

class PostfixTest {

	@Test
	void test() {
		String infixOperation="9+7*3+6";
		Postfix postfix= new Postfix();
		String actualResult=postfix.convertToPostfix(infixOperation);
		assertEquals("973*+6+",actualResult );
	}

}
