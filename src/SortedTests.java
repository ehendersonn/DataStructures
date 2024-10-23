import static org.junit.Assert.*;

import org.junit.Test;

public class SortedTests {

	@Test
	public void insert() {
		SortedLinkedList sll = new SortedLinkedList();
		int actualValue = 0;
		int expectedValue = 50;
		sll.insert(expectedValue);
		actualValue = (int) sll.get(0);
		assertEquals(actualValue, expectedValue);
		assertEquals(sll.getSize(), 1);
	}
	
	@Test
	public void correctOrder() {
		SortedLinkedList sll = new SortedLinkedList();
		sll.insert(5);
		sll.insert(2);
		sll.insert(6);
		sll.insert(7);
		String expectedString = "2, 5, 6, 7, ";
		String actualString = sll.printAllValues();
		assertEquals(actualString, expectedString);
		assertEquals(sll.getSize(), 4);
	}
	
	@Test
	public void delete() {
		SortedLinkedList sll = new SortedLinkedList();
		sll.insert(5);
		sll.insert(2);
		sll.insert(6);
		sll.insert(7);
		sll.delete(2);
		String expectedString = "2, 5, 7, ";
		String actualString = sll.printAllValues();
		assertEquals(actualString, expectedString);
	}

}
