import static org.junit.Assert.*;

import org.junit.Test;

public class DoubleLinkedTests {

	@Test
	public void insertTest() {
		DoubleLinkedList dll = new DoubleLinkedList();
		String expectedString = "4, 6, 3, 9, ";
		dll.insert(4, 0);
		dll.insert(6, 0);
		dll.insert(3, 0);
		dll.insert(9, 0);
		assertEquals(expectedString, dll.toString());
	}
	
	@Test
	public void sizeTest() {
		DoubleLinkedList dll = new DoubleLinkedList();
		int expectedSize = 4;
		dll.insert(4, 0);
		dll.insert(6, 0);
		dll.insert(3, 0);
		dll.insert(9, 0);
		assertEquals(expectedSize, dll.getSize() );
	}
	
	@Test
	public void deleteTest() {
		DoubleLinkedList dll = new DoubleLinkedList();
		String expected = "3, 4, ";
		dll.insert(2, 0);
		dll.insert(3, 0);
		dll.insert(4, 0);
		dll.delete(0);
		assertEquals(expected, dll.toString());
	}

}
