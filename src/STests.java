import static org.junit.Assert.*;

import org.junit.Test;

public class STests {

	@Test
	public void pushTest() {
		Stack s = new Stack();
		int actualValue = 0;
		int expectedValue = 25;
		s.push(expectedValue);
		actualValue = (int) s.top();
		assertEquals(actualValue, expectedValue);
	}
	
	@Test
	public void multiPush() {
		Stack s = new Stack();
		int actualValue = 0;
		int expectedValue = 8;
		s.push(2);
		s.push(3);
		s.push(5);
		s.push(8);
		actualValue = (int) s.top();
		assertEquals(actualValue, expectedValue);
	}
	
	@Test
	public void popTest() {
		Stack s = new Stack();
		int actualValue = 0;
		int expectedValue = 5;
		s.push(2);
		s.push(3);
		s.push(5);
		s.push(8);
		s.pop();
		actualValue = (int) s.top();
		assertEquals(actualValue, expectedValue);
	}
	
	@Test
	public void multiPopTest() {
		Stack s = new Stack();
		int actualValue = 0;
		int expectedValue = 3;
		s.push(2);
		s.push(3);
		s.push(5);
		s.push(8);
		s.pop();
		s.pop();
		actualValue = (int) s.top();
		assertEquals(actualValue, expectedValue);
	}

}
