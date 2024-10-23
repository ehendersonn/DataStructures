
public class SortedLinkedList<T extends Comparable<T>> {

	LinkedListNode<T> head;
	int size = 0;
	
	public SortedLinkedList() {
		head = null;
		size = 0;
	}
	
	public boolean isSmallerThanFirstElement(T value) {
		if(head == null) {
			return true;
		} else {
			if(value.compareTo(head.getValue())<0) {
				return true;
			} else {
				return false;
			}
		}
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
	
	public void insert(T value) {
		size++;
		LinkedListNode<T> currentNode = head;
		if(head==null) {
			head = new LinkedListNode(value,null);
			return;
		}
		
		if(value.compareTo(head.getValue())==-1) {
			LinkedListNode<T> add = new LinkedListNode(value, head);
			head = add;
			return;
		}
		
		LinkedListNode current = head;
		LinkedListNode trailer = new LinkedListNode(value, null);
		
		while(current!=null) {
			if(value.compareTo((T) current.getValue())==-1) {
				LinkedListNode add = new LinkedListNode(value, null);
				trailer.setNext(add);
				add.setNext(current);
				return;
			}
			if(current.getNext() == null) {
				LinkedListNode add = new LinkedListNode(value, null);
				current.setNext(add);
				return;
			}
			trailer = current;
			current = current.getNext();
		}

		if(value.compareTo(currentNode.getValue())==1 || value.compareTo(currentNode.getValue())==0) {
			head = new LinkedListNode(value, currentNode);
		}
	}
	
	public String printAllValues() {
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
