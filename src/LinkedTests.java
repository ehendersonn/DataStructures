import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedTests {

	@Test
	public void simpleInsert() {
		LinkedList ll = new LinkedList();
		int actualValue = 0;
		int expectedValue = 50;
		ll.insert(expectedValue, 0);
		actualValue = (int) ll.get(0);
		assertEquals(actualValue, expectedValue);
		assertEquals(ll.getSize(), 1);
	}
	
	@Test
	public void lotsOfInsertsLinkedListInsert() {
		LinkedList ll = new LinkedList();
		int actualValue = 0;
		int expectedValue = 50;
		ll.insert(expectedValue, 0);
		actualValue = (int) ll.get(0);
		assertEquals(actualValue, expectedValue);
		
		expectedValue = 60;
		ll.insert(expectedValue, 0);
		actualValue = (int) ll.get(0);
		assertEquals(actualValue, expectedValue);
		
		expectedValue = 70;
		ll.insert(expectedValue, 0);
		actualValue = (int) ll.get(0);
		assertEquals(actualValue, expectedValue);
		
		expectedValue = 80;
		ll.insert(expectedValue, 0);
		actualValue = (int) ll.get(0);
		assertEquals(actualValue, expectedValue);
		assertEquals(ll.getSize(), 4);
	}
	
	@Test
	public void lotsOfEndInsertsLinkedListInsert() {
		LinkedList ll = new LinkedList();
		int actualValue = 0;
		int expectedValue = 50;
		ll.insert(expectedValue, 0);
		actualValue = (int) ll.get(0);
		assertEquals(actualValue, expectedValue);
		
		expectedValue = 60;
		ll.insert(expectedValue, 1);
		actualValue = (int) ll.get(1);
		assertEquals(actualValue, expectedValue);
		
		expectedValue = 60;
		ll.insert(expectedValue, 2);
		actualValue = (int) ll.get(2);
		assertEquals(actualValue, expectedValue);
		
		expectedValue = 60;
		ll.insert(expectedValue, 3);
		actualValue = (int) ll.get(3);
		assertEquals(actualValue, expectedValue);
	}
	
	@Test
	public void simpleDelete() {
		LinkedList ll = new LinkedList();
		int actualValue = 0;
		int expectedValue = 50;
		ll.insert(expectedValue, 0);
		actualValue = (int) ll.get(0);
		assertEquals(actualValue, expectedValue);
		assertEquals(ll.getSize(), 1);
		expectedValue = (int) ll.delete(0);
		assertEquals(actualValue, expectedValue);
		assertEquals(ll.getSize(), 0);
	}
	
	@Test
	public void multiDelete() {
		LinkedList ll = new LinkedList();
		int actualValue = 0;
		int expectedValue = 50;
		ll.insert(expectedValue, 0);
		actualValue = (int) ll.get(0);
		assertEquals(actualValue, expectedValue);
		assertEquals(ll.getSize(), 1);
		
		expectedValue = 60;
		ll.insert(expectedValue, 1);
		actualValue = (int) ll.get(1);
		assertEquals(actualValue, expectedValue);
		
		expectedValue = 70;
		ll.insert(expectedValue, 2);
		actualValue = (int) ll.get(2);
		assertEquals(actualValue, expectedValue);
		
		expectedValue = 80;
		ll.insert(expectedValue, 3);
		actualValue = (int) ll.get(3);
		assertEquals(actualValue, expectedValue);
		assertEquals(ll.getSize(), 4);
		
		expectedValue = 70;
		actualValue = (int) ll.delete(2);
		assertEquals(actualValue, expectedValue);
		assertEquals(ll.getSize(), 3);
		
		String expectedString = "50, 60, 80, ";
		String actualString = ll.toString();
		assertEquals(actualString, expectedString);
	}
	
}
