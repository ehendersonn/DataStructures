public class Queue<T> {

	class Node<T>{
		T value;
		Node<T> previous;
		Node<T> next;
		
		public Node(T value) {
			this.value = value;
		}
		
		public T getValue() {
			return value;
		}
	}
	
	Node<T> head = null;
	Node<T> tail = null;
	int size = 0;
	
	public void push(T value) {
		Node<T> newNode = new Node(value);
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
		System.out.println(tail.value);
	}
	
	public T pop() {	
		if(head == null) {
			return null;
		}
		T value = head.value;
		if(head.next == null) {
			tail = null;
			head = null;
			return value;
		}
		head = head.next;
		return value;
	}
	
	public T top() {
		if(head == null) {
			return null;
		}
		return (T) head.value;
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
