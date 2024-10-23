
public class DoubleLinkedList<T> {
	
	class Node<T>{
		T value;
		int index;
		Node<T> previous;
		Node<T> next;
		
		public Node(T value, int index) {
			this.value = value;
			this.index = index;
		}
		
		public T getValue() {
			return value;
		}
	}
	
	Node<T> head = null;
	Node<T> tail = null;
	int size = 0;
	
	public void insert(T value, int index) {
		Node<T> newNode = new Node(value, 0);
		size++;
		if(index<0) {
			throw new OutOfBoundsException();
		}
		
		if(head == null) {
			head = newNode;
			tail = newNode;
			head.previous = null;
			tail.next = null;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public T delete(int index) {
		if(index<0 || index>=size) {
			throw new OutOfBoundsException();
		}
		T rtnValue = null;
		if(index == 0) {
			size--;
			rtnValue = head.getValue();
			head = head.next;
			return rtnValue;
		}
		Node<T> currentNode = head;
		int currentIndex = 1;
		while(currentIndex<index && currentNode.next!=null) {
			currentIndex++;
			currentNode = currentNode.next;
		}
		size--;
		if(currentNode.next==null) {
			throw new ImpossibleException();
		}
		rtnValue = currentNode.next.getValue();
		currentNode.next = currentNode.next.next;
		return rtnValue;
	}
	
	public String toString() {
		if(head == null) {
			return "The list is empty";
		} 
		
		Node<T> currentNode = head;
		String rtnValue = currentNode.getValue()+", ";
		while(currentNode.next!=null) {
			currentNode = currentNode.next;
			rtnValue += currentNode.getValue()+", ";
		}
		return rtnValue;
	}	
}
