public class LinkedList<T> {
	
	LinkedListNode<T> head;
	int size = 0;
	
	public LinkedList() {
		head = null;
		size = 0;
	}	
	
	public T get(int index) {
		if(index < 0 || index >=size) {
			throw new OutOfBoundsException();
		}
			
		LinkedListNode<T> currentNode = head;
		int currentIndex = 0;
		while(currentNode.getNext()!=null) {
			if(currentIndex == index) {
				return currentNode.getValue();
			}
			currentIndex++;
			currentNode = currentNode.getNext();
		}
		
		if(currentIndex == index) {
			return currentNode.getValue();
		}
		//This should never throw
		System.err.println("This should never be reached");
		throw new ImpossibleException();				
	}
	
	public T delete(int index) {
		if(index < 0 || index >=size) {
			throw new OutOfBoundsException();
		}
		T rtnValue = null;
		if(index ==0) {
			size--;
			rtnValue = head.getValue();
			head = head.getNext();
			return rtnValue;
		}
		
		LinkedListNode<T> currentNode = head;
		int currentIndex = 1;
		while(currentIndex<index && currentNode.getNext()!=null) {
			currentIndex++;
			currentNode = currentNode.getNext();
		}
		size--;
		if(currentNode.getNext()==null) {
			throw new ImpossibleException();
		}
		rtnValue = currentNode.getNext().getValue();

		//FIX DELETE and DO JUNIT TESTING
		currentNode.setNext(currentNode.getNext().getNext());
		return rtnValue;
	}
	
	public int getSize() {
		return size;
		
	}
	
	public void insert(T value, int index) {
		if(index < 0) {
			throw new OutOfBoundsException();
		}		
		size++;
		
		if(head==null || index ==0) {
			head = new LinkedListNode<T>(value, head);
			return;
		}
		LinkedListNode<T> currentNode = head;
		int currentIndex = 1;
		while(currentIndex<index && currentNode.getNext()!=null) {
			currentIndex++;
			currentNode = currentNode.getNext();
		}
		
		LinkedListNode<T> insertedNode = new LinkedListNode<T>(value, currentNode.getNext());
		currentNode.setNext(insertedNode);
	}
	
	
	public String toString() {
		if(head == null) {
			return "The list is empty";
		} 
		
		LinkedListNode<T> currentNode = head;
		String rtnValue = currentNode.getValue()+", ";
		while(currentNode.getNext()!=null) {
			currentNode = currentNode.getNext();
			rtnValue += currentNode.getValue()+", ";
		}
		return rtnValue;				
	}

}
