
public class Stack<T> {

	StackNode<T> head = null;
	
	public T pop() {
		if(head == null) {
			System.out.println("The stack is empty");
			return null;
		}
		T value = head.value;
		head = head.next;
		return value;
	}
	
	public void push(T value) {
		StackNode<T> prevHead = head;
		head = new StackNode<T>();
		head.value = value;
		head.next = prevHead;
	}
	
	public T top() {
		if(head == null) {
			System.out.println("The stack is empty");
			return null;
		}
		return head.value;
	}
	
	
}
