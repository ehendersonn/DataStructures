import static org.junit.Assert.*;

import org.junit.Test;

public class QTests {

	@Test
	public void pushTest() {
		Queue q = new Queue();
		int actualValue = 0;
		int expectedValue = 25;
		q.push(expectedValue);
		actualValue = (int) q.top();
		assertEquals(actualValue, expectedValue);
	}

	@Test
	public void multiPush() {
		Queue q = new Queue();
		int actualValue = 0;
		int expectedValue = 2;
		q.push(2);
		q.push(3);
		q.push(5);
		q.push(8);
		actualValue = (int) q.top();
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void popTest() {
		Queue q = new Queue();
		q.push(2);
		q.push(3);
		q.push(8);
		q.push(5);
		q.pop();
		String expectedString = "3, 8, 5, ";
		String actualString = q.toString();
		assertEquals(expectedString, actualString);
	}
}
